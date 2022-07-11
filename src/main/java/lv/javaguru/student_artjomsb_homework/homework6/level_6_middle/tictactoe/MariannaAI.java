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

    void getMove(String[][] field, String playerToCheck) {
        Random randomXY = new Random();
        if (isPossibleToWin(field, playerToCheck)) {
            tryToWin(field, playerToCheck);
        } else if (checkOnBlocking(field, playerToCheck)) {
            blockOpponent(field, playerToCheck);
        } else if (isMiddleOpen(field)) {
            this.x = 1;
            this.y = 1;
        } else {
            this.x = randomXY.nextInt(3);
            this.y = randomXY.nextInt(3);
        }
    }

    boolean isMiddleOpen(String[][] gamingField) {
        return gamingField[1][1].equals("-");
    }

    boolean isPossibleToWin(String[][] field, String playerToCheck) {
        return isPossibleWinForHorizontals(field, playerToCheck) != -1 || isPossibleWinForVerticals(field, playerToCheck) != -1
                || isPossibleWinFromLeftTopToRightBottom(field, playerToCheck) || isPossibleWinFromTopRightToLeftBottom(field, playerToCheck);
    }

    public int isPossibleWinForHorizontals(String[][] field, String playerToCheck) {
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

    public int isPossibleWinForVerticals(String[][] field, String playerToCheck) {
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
        if (counterOpponent == 0 && counterYourself == 2) {
            return true;
        } else {
            return false;
        }
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
        if (counterOpponent == 0 && counterYourself == 2) {
            return true;
        } else {
            return false;
        }
    }

    boolean checkOnBlocking(String[][] field, String playerToCheck) {
        return isWinForHorizontals(field, playerToCheck) != -1 || isWinPositionForVerticals(field, playerToCheck) != -1
                || isWinFromLeftTopToRightBottom(field, playerToCheck) || isWinFromTopRightToLeftBottom(field, playerToCheck);
    }

    void tryToWin(String[][] gamingField, String playerToCheck) {
        if (isPossibleWinForHorizontals(gamingField, playerToCheck) != -1) {
            this.x = isPossibleWinForHorizontals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[x][i].equals("-")) {
                    this.y = i;
                }
            }
        } else if (isPossibleWinForVerticals(gamingField, playerToCheck) != -1) {

            this.y = isPossibleWinForVerticals(gamingField, playerToCheck);
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
        if (isWinForHorizontals(gamingField, playerToCheck) != -1) {
            this.x = isWinForHorizontals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[x][i].equals("-")) {
                    this.y = i;
                }
            }
        } else if (isWinPositionForVerticals(gamingField, playerToCheck) != -1) {
            this.y = isWinPositionForVerticals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][y].equals("-")) {
                    this.x = i;
                }
            }
        } else if (isWinFromLeftTopToRightBottom(gamingField, playerToCheck)) {
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][i].equals("-")) {
                    this.x = i;
                    this.y = i;
                    break;
                }
            }
        } else if (isWinFromTopRightToLeftBottom(gamingField, playerToCheck)) {
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[i][gamingField[i].length - 1 - i].equals("-")) {
                    this.x = i;
                    this.y = gamingField.length - 1 - i;
                }
            }

        }

    }

    public boolean isWinFromLeftTopToRightBottom(String[][] field, String playerToCheck) {
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][i].equals(ticTacToeRole)) {
                counterYourself++;
            }
        }
        if (counterOpponent == 2 && counterYourself == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isWinFromTopRightToLeftBottom(String[][] field, String playerToCheck) {
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][field[i].length - 1 - i].equals(ticTacToeRole)) {
                counterYourself++;
            }
        }
        if (counterOpponent == 2 && counterYourself == 0) {
            return true;
        } else {
            return false;
        }
    }


    public int isWinForHorizontals(String[][] field, String playerToCheck) {
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

    public int isWinPositionForVerticals(String[][] field, String playerToCheck) {
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
