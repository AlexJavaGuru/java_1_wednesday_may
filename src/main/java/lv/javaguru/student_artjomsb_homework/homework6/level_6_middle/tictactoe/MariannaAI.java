package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Random;

class MariannaAI {
    private int x;
    private int y;
    private String ticTacToeRole;
    private boolean tactic;

    MariannaAI(int x, int y, String ticTacToeRole, boolean cornerTactic) {
        this.x = x;
        this.y = y;
        this.ticTacToeRole = ticTacToeRole;
        this.tactic = cornerTactic;
    }

    void getMove(String[][] field, String playerToCheck) {
        if (isNextMoveWillGetWinOrLose(field, getTicTacToeRole())) {
            makeMove(field);
        } else if (isNextMoveWillGetWinOrLose(field, playerToCheck)) {
            makeMove(field);
        } else if (isDoubleWinPositionPossible(field, getTicTacToeRole())) {
            makeMove(field);
        } else if (isDoubleWinPositionPossible(field, playerToCheck) && !isOneOfDiagonalIsFull(field, playerToCheck)) {
            makeMove(field);
        } else if (isWinTacticPossible(field) && tactic) {
            if (!isPossibleToMoveInOppositeCorner(field)) {
                moveToRandomCorner(field);
            } else makeMove(field);
        } else if (isMiddleOpen(field)) {
            makeMove(field);
        } else if (isOneOfDiagonalIsFull(field, playerToCheck)) {
            if (!defenceMove(field)) {
                moveToRandomCorner(field);
            } else makeMove(field);
        } else if (howManyCornersOpen(field) > 0) {
            if (!moveToBestCorner(field, playerToCheck)) {
                moveToRandomCorner(field);
            } else makeMove(field);
        } else {
            noobMove(field);
        }
    }

    void makeMove(String[][] field) {
        field[x][y] = ticTacToeRole;
    }

    boolean isNextMoveWillGetWinOrLose(String[][] field, String player) {
        TicTacToe winChecker = new TicTacToe();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("-")) {
                    field[i][j] = player;
                    if (winChecker.isWin(field, player)) {
                        field[i][j] = "-";
                        this.x = i;
                        this.y = j;
                        return true;
                    }
                    field[i][j] = "-";
                }
            }
        }
        return false;
    }

    boolean isDoubleWinPositionPossible(String[][] gamingField, String playerToCheck) {

        for (int i = 0; i < gamingField.length; i++) {
            for (int j = 0; j < gamingField.length; j++) {
                if (gamingField[i][j].equals("-")) {
                    gamingField[i][j] = playerToCheck;
                    if (howManyWinsIsPossible(gamingField, playerToCheck) > 1) {
                        gamingField[i][j] = "-";
                        this.x = i;
                        this.y = j;
                        return true;
                    }
                    gamingField[i][j] = "-";
                }
            }
        }
        return false;
    }

    int howManyWinsIsPossible(String[][] field, String playerToCheck) {
        TicTacToe winChecker = new TicTacToe();
        int winCounter = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                if (field[i][j].equals("-")) {
                    field[i][j] = playerToCheck;
                    if (winChecker.isWin(field, playerToCheck)) {
                        field[i][j] = "-";
                        winCounter++;
                    }
                    field[i][j] = "-";
                }
            }
        }
        return winCounter;
    }

    boolean isOneOfDiagonalIsFull(String[][] field, String playerToCheck) {
        return (isDiagonalBottomTopFull(field, playerToCheck) || isDiagonalTopBottomFull(field, playerToCheck));
    }

    boolean moveToBestCorner(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i += 2) {
            for (int j = 0; j < field[i].length; j += 2) {
                if (field[i][j].equals("-") && symmetricCornerFieldValue(field, i, j).equals("-") && !isNearCornerOpponent(field, playerToCheck, i, j)) {
                    this.x = i;
                    this.y = j;
                    return true;
                }
            }
        }
        return false;
    }

    boolean defenceMove(String[][] field) {
        if (field[1][1].equals(ticTacToeRole) || !isCornersOpenAndMyRoleInCorner(field)) {
            for (int i = 0; i < field.length; i++) {
                for (int j = 0; j < field[i].length; j++) {
                    if (((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) && field[i][j].equals("-")) {
                        this.x = i;
                        this.y = j;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    boolean isWinTacticPossible(String[][] field) {
        return (isFieldEmpty(field) || isCornersOpenAndMyRoleInCorner(field));
    }
    boolean isFieldEmpty(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (!field[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isCornersOpenAndMyRoleInCorner(String[][] field) {
        int emptyCorners = 0;
        boolean myRoleInCorner = false;
        for (int i = 0; i < field.length; i += 2) {
            for (int j = 0; j < field[i].length; j += 2) {
                if (field[i][j].equals("-")) {
                    emptyCorners++;
                } else if (field[i][j].equals(ticTacToeRole)) {
                    myRoleInCorner = true;
                }
                if (myRoleInCorner && i == j && i == field.length - 1 && emptyCorners > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    int howManyCornersOpen(String[][] gameField) {
        int corners = 0;
        for (int i = 0; i < gameField.length; i += 2) {
            for (int j = 0; j < gameField[i].length; j += 2) {
                if (gameField[i][j].equals("-")) {// && i + j != 4
                    corners++;
                }
            }
        }
        return corners;
    }

    boolean isPossibleToMoveInOppositeCorner(String[][] field) {
        for (int i = 0; i < field.length; i += 2) {
            for (int j = 0; j < field[i].length; j += 2) {
                if (i == j && i == 0 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 2;
                    this.y = 2;
                    return true;
                } else if (i == j && i == 2 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 0;
                    this.y = 0;
                    return true;
                } else if (i == 2 && j == 0 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 0;
                    this.y = 2;
                    return true;
                } else if (i == 0 && j == 2 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 2;
                    this.y = 0;
                    return true;
                }
            }
        }
        return false;
    }

    void moveToRandomCorner(String[][] field) {
        Random randomCorner = new Random();
        switch (randomCorner.nextInt(4)) {
            case 0 -> {
                this.x = 2;
                this.y = 2;
            }
            case 1 -> {
                this.x = 0;
                this.y = 0;
            }
            case 2 -> {
                this.x = 0;
                this.y = 2;
            }
            case 3 -> {
                this.x = 2;
                this.y = 0;
            }
        }
        if (field[x][y].equals("-")) {
            makeMove(field);
        } else {
            moveToRandomCorner(field);
        }
    }

    String symmetricCornerFieldValue(String[][] field, int x, int y) {
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

    boolean isMiddleOpen(String[][] gamingField) {
        if (gamingField[1][1].equals("-")) {
            this.x = 1;
            this.y = 1;
            return true;
        } else {
            return false;
        }
    }

    void noobMove(String[][] field) {
        Random randomXY = new Random();
        while (true) {
            this.x = randomXY.nextInt(3);
            this.y = randomXY.nextInt(3);
            if (field[x][y].equals("-")) {
                makeMove(field);
                break;
            }
        }
    }

    String getTicTacToeRole() {
        return ticTacToeRole;
    }

    void randomTactic() {
        Random random = new Random();
        this.tactic = random.nextInt(2) == 1;
    }

    void setTicTacToeRole(String ticTacToeRole) {
        this.ticTacToeRole = ticTacToeRole;
    }

}
