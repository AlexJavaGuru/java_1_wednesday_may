package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Random;

class MariannaAI {
    private int x;
    private int y;
    private String ticTacToeRole;

    MariannaAI(int x, int y, String ticTacToeRole) {
        this.x = x;
        this.y = y;
        this.ticTacToeRole = ticTacToeRole;
    }

    void noobMove() {
        Random randomXY = new Random();
        this.x = randomXY.nextInt(3);
        this.y = randomXY.nextInt(3);
    }

    void getMove(String[][] field, String playerToCheck) {
        Random randomXY = new Random();
        if (isPossibleToWin(field, playerToCheck)) {
            tryToWin(field, playerToCheck);
        } else if (checkOnBlocking(field, playerToCheck)) {
            blockOpponent(field, playerToCheck);
        } else if (isMiddleOpen(field)) {
            this.x = 1;
            this.y = 1;
        } else if ((isDiagonalBottomTopFull(field, playerToCheck) || isDiagonalTopBottomFull(field, playerToCheck)) && isCrossEmpty(field)) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) && field[i][j].equals("-")) {
                        this.x = i;
                        this.y = j;
                    }
                }
            }

        } else if (howManyCornersOpen(field) > 1) {
            boolean isFind = false;
            for (int i = 0; i < field.length; i += 2) {
                if (isFind) {
                    break;
                }
                for (int j = 0; j < field[i].length; j += 2) {
                    if (field[i][j].equals("-") && symmetricFieldValue(field, i, j).equals("-") && !isNearCornerOpponent(field, playerToCheck, i, j)) {
                        this.x = i;
                        this.y = j;
                        isFind = true;
                        break;
                    }
                }
            }
        } else {
            this.x = randomXY.nextInt(3);
            this.y = randomXY.nextInt(3);
        }
    }

    void tryToWin(String[][] gamingField, String playerToCheck) {
        if (possibleWinForHorizontals(gamingField, playerToCheck) != -1) {
            this.x = possibleWinForHorizontals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[x][i].equals("-")) {
                    this.y = i;
                }
            }
        } else if (possibleWinForVerticals(gamingField, playerToCheck) != -1) {

            this.y = possibleWinForVerticals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][y].equals("-")) {
                    this.x = i;
                }
            }
        } else if (isPossibleWinFromLeftTopToRightBottom(gamingField, playerToCheck)) {
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][i].equals("-")) {
                    this.x = i;
                    this.y = i;
                    break;
                }
            }
        } else if (isPossibleWinFromTopRightToLeftBottom(gamingField, playerToCheck)) {
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][gamingField[i].length - 1 - i].equals("-")) {
                    this.x = i;
                    this.y = gamingField.length - 1 - i;
                }
            }
        }
    }

    void blockOpponent(String[][] gamingField, String playerToCheck) {
        if (opponentWinForHorizontals(gamingField, playerToCheck) != -1) {
            this.x = opponentWinForHorizontals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[x][i].equals("-")) {
                    this.y = i;
                }
            }
        } else if (opponentWinPositionForVerticals(gamingField, playerToCheck) != -1) {
            this.y = opponentWinPositionForVerticals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][y].equals("-")) {
                    this.x = i;
                }
            }
        } else if (isOpponentWinFromLeftTopToRightBottom(gamingField, playerToCheck)) {
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][i].equals("-")) {
                    this.x = i;
                    this.y = i;
                    break;
                }
            }
        } else if (isOpponentWinFromTopRightToLeftBottom(gamingField, playerToCheck)) {
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][gamingField[i].length - 1 - i].equals("-")) {
                    this.x = i;
                    this.y = gamingField.length - 1 - i;
                }
            }

        }

    }

    boolean checkOnBlocking(String[][] field, String playerToCheck) {
        return opponentWinForHorizontals(field, playerToCheck) != -1 || opponentWinPositionForVerticals(field, playerToCheck) != -1
                || isOpponentWinFromLeftTopToRightBottom(field, playerToCheck) || isOpponentWinFromTopRightToLeftBottom(field, playerToCheck);
    }

    boolean isPossibleToWin(String[][] field, String playerToCheck) {
        return possibleWinForHorizontals(field, playerToCheck) != -1 || possibleWinForVerticals(field, playerToCheck) != -1
                || isPossibleWinFromLeftTopToRightBottom(field, playerToCheck) || isPossibleWinFromTopRightToLeftBottom(field, playerToCheck);
    }

    boolean isMiddleOpen(String[][] gamingField) {
        return gamingField[1][1].equals("-");
    }

    int howManyCornersOpen(String[][] gameField) {
        int corners = 0;
        for (int i = 0; i < gameField.length; i += 2) {
            for (int j = 0; j < gameField[i].length; j += 2) {
                if (gameField[i][j].equals("-") && i + j != 4) {
                    corners++;
                }
            }
        }
        return corners;
    }

    // 00 | 01 | 02
    // 10 | 11 | 12
    // 20 | 21 | 22
    String symmetricFieldValue(String[][] field, int x, int y) {
        String fieldValue = "";
        if (x == y && x == 0) {
            fieldValue = field[2][2];
        } else if (x == y && x == 2) {
            fieldValue = field[0][0];
        } else if (x == 2 && y == 0) {
            fieldValue = field[0][2];
        } else if (x == 0 && y == 2) {
            fieldValue = field[2][0];
        }
        return fieldValue;
    }

    boolean isNearCornerOpponent(String[][] field, String opponent, int x, int y) {
        if (x == y && x == 0) {
            return field[0][1].equals(opponent) || field[1][0].equals(opponent);
        } else if (x == y && x == 2) {
            return field[2][1].equals(opponent) || field[1][2].equals(opponent);
        } else if (x == 2 && y == 0) {
            return field[2][1].equals(opponent) || field[1][0].equals(opponent);
        } else if (x == 0 && y == 2) {
            return field[0][1].equals(opponent) || field[1][2].equals(opponent);
        } else {
            return false;
        }
    }

    boolean isDiagonalTopBottomFull(String[][] field, String opponent) {
        int opponentCounter = 0;
        int yourselfCounter = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i].equals(opponent)) {
                opponentCounter++;
            } else if (field[i][i].equals(ticTacToeRole)) {
                yourselfCounter++;
            }
        }
        return opponentCounter == 2 && yourselfCounter == 1;
    }

    boolean isDiagonalBottomTopFull(String[][] field, String opponent) {
        int opponentCounter = 0;
        int yourselfCounter = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field.length - 1 - i].equals(opponent)) {
                opponentCounter++;
            } else if (field[i][field.length - 1 - i].equals(ticTacToeRole)) {
                yourselfCounter++;
            }
        }
        return opponentCounter == 2 && yourselfCounter == 1;
    }

    boolean isCrossEmpty(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) && field[i][j].equals("-") && i == field.length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public int possibleWinForHorizontals(String[][] field, String playerToCheck) {
        int counterOpponent;
        int counterYourself;
        for (int i = 0; i < field.length; i++) {
            counterOpponent = 0;
            counterYourself = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(playerToCheck)) {
                    counterOpponent++;

                } else if (field[i][j].equals(ticTacToeRole)) {
                    counterYourself++;
                }
                if (j == field[i].length - 1 && counterOpponent == 0 && counterYourself == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int possibleWinForVerticals(String[][] field, String playerToCheck) {
        int counterOpponent;
        int counterYourself;
        for (int i = 0; i < field.length; i++) {
            counterOpponent = 0;
            counterYourself = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i].equals(playerToCheck)) {
                    counterOpponent++;
                } else if (field[j][i].equals(ticTacToeRole)) {
                    counterYourself++;
                }
                if (j == field[i].length - 1 && counterOpponent == 0 && counterYourself == 2) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean isPossibleWinFromLeftTopToRightBottom(String[][] field, String playerToCheck) {
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][i].equals(ticTacToeRole)) {
                counterYourself++;
            }
        }
        return counterOpponent == 0 && counterYourself == 2;
    }

    public boolean isPossibleWinFromTopRightToLeftBottom(String[][] field, String playerToCheck) {
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][field[i].length - 1 - i].equals(ticTacToeRole)) {
                counterYourself++;
            }
        }
        return counterOpponent == 0 && counterYourself == 2;
    }

    public boolean isOpponentWinFromLeftTopToRightBottom(String[][] field, String playerToCheck) {
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][i].equals(ticTacToeRole)) {
                counterYourself++;
            }
        }
        return counterOpponent == 2 && counterYourself == 0;
    }

    public boolean isOpponentWinFromTopRightToLeftBottom(String[][] field, String playerToCheck) {
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][field[i].length - 1 - i].equals(ticTacToeRole)) {
                counterYourself++;
            }
        }
        return counterOpponent == 2 && counterYourself == 0;
    }


    public int opponentWinForHorizontals(String[][] field, String playerToCheck) {
        int counterOpponent;
        int counterYourself;
        for (int i = 0; i < field.length; i++) {
            counterOpponent = 0;
            counterYourself = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(playerToCheck)) {
                    counterOpponent++;

                } else if (field[i][j].equals(ticTacToeRole)) {
                    counterYourself++;
                }
                if (j == field[i].length - 1 && counterOpponent == 2 && counterYourself == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int opponentWinPositionForVerticals(String[][] field, String playerToCheck) {
        int counterX;
        int counter0;
        for (int i = 0; i < field.length; i++) {
            counterX = 0;
            counter0 = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i].equals(playerToCheck)) {
                    counterX++;
                } else if (field[j][i].equals(ticTacToeRole)) {
                    counter0++;
                }
                if (j == field[i].length - 1 && counterX == 2 && counter0 == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public String getTicTacToeRole() {
        return ticTacToeRole;
    }

    public void setTicTacToeRole(String ticTacToeRole) {
        this.ticTacToeRole = ticTacToeRole;
    }
}
