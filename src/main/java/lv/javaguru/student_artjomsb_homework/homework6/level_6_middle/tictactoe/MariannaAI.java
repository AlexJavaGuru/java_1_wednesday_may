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
        if (isPossibleToWin(field, getTicTacToeRole())) {
            System.out.println(1);
            tryToWin(field, getTicTacToeRole());
        } else if (checkOnBlocking(field, playerToCheck)) {
            System.out.println(2);
            blockOpponent(field, playerToCheck);
        } else if (isDoubleWinPositionPossible(field, getTicTacToeRole())) {
            System.out.println(3);
        } else if (isDoubleWinPositionPossible(field, playerToCheck) && !defenceFromWinTactic(field, playerToCheck)) {
            System.out.println(4);
        } else if (isWinTacticPossible(field) && tactic) {
            System.out.println(5);
            moveToOppositeCornerOrRandomCorner(field);
        }
        else if (isMiddleOpen(field)) {
            System.out.println(6);
            goToMiddle();
        }
        else if (defenceFromWinTactic(field, playerToCheck)) {
            System.out.println(7);
            defenceMove(field);
        } else if (howManyCornersOpen(field) > 1) {
            System.out.println(8);
            moveToBestCorner(field, playerToCheck);
        } else {
            noobMove();
        }
    }

    boolean isDoubleWinPositionPossible(String[][] gamingField, String playerToCheck) {

        if (howManyOpponentMadeTurns(gamingField, playerToCheck) >= 2) {
            for (int i = 0; i < gamingField.length; i++) {
                for (int j = 0; j < gamingField.length; j++) {
                    if (gamingField[i][j].equals("-")) {
                        gamingField[i][j] = playerToCheck;
                        if (opponentPossibleWins(gamingField, playerToCheck) >= 2) {
                            gamingField[i][j] = "-";
                            this.x = i;
                            this.y = j;
                            return true;
                        }
                        gamingField[i][j] = "-";
                    }
                }
            }
        }
        return false;
    }

    int opponentPossibleWins(String[][] field, String playerToCheck) {
        boolean[] opponentPossibleWins = {lineOfWinForHorizontals(field, playerToCheck) != -1, lineOfWinPositionForVerticals(field, playerToCheck) != -1
                , isWinFromLeftTopToRightBottom(field, playerToCheck), isWinFromTopRightToLeftBottom(field, playerToCheck)};
        int countWins = 0;
        for (boolean opponentPossibleWin : opponentPossibleWins) {
            if (opponentPossibleWin) {
                countWins++;
            }
        }
        return countWins;
    }

    int howManyOpponentMadeTurns(String[][] gamingField, String playerToCheck) {
        int opponentTurns = 0;
        for (int i = 0; i < gamingField.length; i++) {
            for (int j = 0; j < gamingField.length; j++) {
                if (gamingField[i][j].equals(playerToCheck)) {
                    opponentTurns++;
                }
            }
        }
        return opponentTurns;
    }

    void tryToWin(String[][] gamingField, String playerToCheck) {
        if (lineOfWinForHorizontals(gamingField, playerToCheck) != -1) {
            this.x = lineOfWinForHorizontals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[x][i].equals("-")) {
                    this.y = i;
                }
            }
        } else if (lineOfWinPositionForVerticals(gamingField, playerToCheck) != -1) {
            this.y = lineOfWinPositionForVerticals(gamingField, playerToCheck);
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

    boolean isPossibleToWin(String[][] field, String playerToCheck) {
        return lineOfWinForHorizontals(field, playerToCheck) != -1 || lineOfWinPositionForVerticals(field, playerToCheck) != -1
                || isWinFromLeftTopToRightBottom(field, playerToCheck) || isWinFromTopRightToLeftBottom(field, playerToCheck);
    }

    void blockOpponent(String[][] gamingField, String playerToCheck) {
        if (lineOfWinForHorizontals(gamingField, playerToCheck) != -1) {
            this.x = lineOfWinForHorizontals(gamingField, playerToCheck);
            for (int i = 0; i < gamingField.length; i++) {
                if (gamingField[x][i].equals("-")) {
                    this.y = i;
                }
            }
        } else if (lineOfWinPositionForVerticals(gamingField, playerToCheck) != -1) {
            this.y = lineOfWinPositionForVerticals(gamingField, playerToCheck);
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

    boolean checkOnBlocking(String[][] field, String playerToCheck) {
        return lineOfWinForHorizontals(field, playerToCheck) != -1 || lineOfWinPositionForVerticals(field, playerToCheck) != -1
                || isWinFromLeftTopToRightBottom(field, playerToCheck) || isWinFromTopRightToLeftBottom(field, playerToCheck);
    }

    boolean defenceFromWinTactic(String[][] field, String playerToCheck) {
        return (isDiagonalBottomTopFull(field, playerToCheck) || isDiagonalTopBottomFull(field, playerToCheck)) && isCrossEmpty(field);
    }

    void noobMove() {
        Random randomXY = new Random();
        this.x = randomXY.nextInt(3);
        this.y = randomXY.nextInt(3);
    }

    void moveToBestCorner(String[][] field, String playerToCheck) {
        boolean isFind = false;
        for (int i = 0; i < field.length; i += 2) {
            if (isFind) {
                break;
            }
            for (int j = 0; j < field[i].length; j += 2) {
                if (field[i][j].equals("-") && symmetricCornerFieldValue(field, i, j).equals("-") && !isNearCornerOpponent(field, playerToCheck, i, j)) {
                    this.x = i;
                    this.y = j;
                    isFind = true;
                    break;
                }
            }
        }
        moveToRandomCorner();
    }

    void goToMiddle() {
        this.x = 1;
        this.y = 1;
    }

    void defenceMove(String[][] field) {
        if (field[1][1].equals(ticTacToeRole)) {
            boolean isFind = false;
            for (int i = 0; i < field.length; i++) {
                if (isFind) {
                    break;
                }
                for (int j = 0; j < field[i].length; j++) {
                    if (((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) && field[i][j].equals("-")) {
                        this.x = i;
                        this.y = j;
                        isFind = true;
                        break;
                    }
                }
            }
        } else {
            moveToRandomCorner();
        }
    }

    boolean isMiddleOpen(String[][] gamingField) {
        return gamingField[1][1].equals("-");
    }

    boolean isWinTacticPossible(String[][] field) {
        return (isFieldEmpty(field) || isCornersOpen(field)) && isCrossEmpty(field);
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

    boolean isCornersOpen(String[][] field) {
        int emptyCorners = 0;
        boolean myRoleInCorner = false;
        for (int i = 0; i < field.length; i += 2) {
            for (int j = 0; j < field[i].length; j += 2) {
                if (field[i][j].equals("-")) {
                    emptyCorners++;
                } else if (field[i][j].equals(ticTacToeRole)) {
                    myRoleInCorner = true;
                }
                if (myRoleInCorner && i == j && i == field.length - 1 && emptyCorners >= 1) {
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
                if (gameField[i][j].equals("-") && i + j != 4) {
                    corners++;
                }
            }
        }
        return corners;
    }

    void moveToOppositeCornerOrRandomCorner(String[][] field) {
        boolean isFind = false;
        for (int i = 0; i < field.length; i += 2) {
            if (isFind) {
                break;
            }
            for (int j = 0; j < field[i].length; j += 2) {
                if (i == j && i == 0 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 2;
                    this.y = 2;
                    isFind = true;
                    break;
                } else if (i == j && i == 2 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 0;
                    this.y = 0;
                    isFind = true;
                    break;
                } else if (i == 2 && j == 0 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 0;
                    this.y = 2;
                    isFind = true;
                    break;
                } else if (i == 0 && j == 2 && field[i][j].equals(ticTacToeRole) && symmetricCornerFieldValue(field, i, j).equals("-")) {
                    this.x = 2;
                    this.y = 0;
                    isFind = true;
                    break;
                }
            }
        }
        if (!isFind) {
            moveToRandomCorner();
        }
    }

    void moveToRandomCorner() {
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

    boolean isCrossEmpty(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (((i % 2 == 0 && j % 2 != 0) || (i % 2 != 0 && j % 2 == 0)) && !field[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

//    public int possibleWinForHorizontals(String[][] field, String playerToCheck) {
//        int counterOpponent;
//        int counterYourself;
//        for (int i = 0; i < field.length; i++) {
//            counterOpponent = 0;
//            counterYourself = 0;
//            for (int j = 0; j < field[i].length; j++) {
//                if (field[i][j].equals(playerToCheck)) {
//                    counterOpponent++;
//
//                } else if (field[i][j].equals(ticTacToeRole)) {
//                    counterYourself++;
//                }
//                if (j == field[i].length - 1 && counterOpponent == 0 && counterYourself == 2) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public int possibleWinForVerticals(String[][] field, String playerToCheck) {
//        int counterOpponent;
//        int counterYourself;
//        for (int i = 0; i < field.length; i++) {
//            counterOpponent = 0;
//            counterYourself = 0;
//            for (int j = 0; j < field[i].length; j++) {
//                if (field[j][i].equals(playerToCheck)) {
//                    counterOpponent++;
//                } else if (field[j][i].equals(ticTacToeRole)) {
//                    counterYourself++;
//                }
//                if (j == field[i].length - 1 && counterOpponent == 0 && counterYourself == 2) {
//                    return i;
//                }
//            }
//        }
//        return -1;
//    }
//
//    public boolean isPossibleWinFromLeftTopToRightBottom(String[][] field, String playerToCheck) {
//        int counterOpponent = 0;
//        int counterYourself = 0;
//        for (int i = 0; i < field.length; i++) {
//            if (field[i][i].equals(playerToCheck)) {
//                counterOpponent++;
//            } else if (field[i][i].equals(ticTacToeRole)) {
//                counterYourself++;
//            }
//        }
//        return counterOpponent == 0 && counterYourself == 2;
//    }
//
//    public boolean isPossibleWinFromTopRightToLeftBottom(String[][] field, String playerToCheck) {
//        int counterOpponent = 0;
//        int counterYourself = 0;
//        for (int i = 0; i < field.length; i++) {
//            if (field[i][field[i].length - 1 - i].equals(playerToCheck)) {
//                counterOpponent++;
//            } else if (field[i][field[i].length - 1 - i].equals(ticTacToeRole)) {
//                counterYourself++;
//            }
//        }
//        return counterOpponent == 0 && counterYourself == 2;
//    }

    public boolean isWinFromLeftTopToRightBottom(String[][] field, String playerToCheck) {
        String secondPlayerRole;
        int counterOpponent = 0;
        int counterYourself = 0;
        if (playerToCheck.equals("X")) {
            secondPlayerRole = "0";
        } else {
            secondPlayerRole = "X";
        }
        for (int i = 0; i < field.length; i++) {
            if (field[i][i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][i].equals(secondPlayerRole)) {
                counterYourself++;
            }
        }
        return counterOpponent == 2 && counterYourself == 0;
    }

    public boolean isWinFromTopRightToLeftBottom(String[][] field, String playerToCheck) {
        String secondPlayerRole;
        if (playerToCheck.equals("X")) {
            secondPlayerRole = "0";
        } else {
            secondPlayerRole = "X";
        }
        int counterOpponent = 0;
        int counterYourself = 0;
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i].equals(playerToCheck)) {
                counterOpponent++;
            } else if (field[i][field[i].length - 1 - i].equals(secondPlayerRole)) {
                counterYourself++;
            }
        }
        return counterOpponent == 2 && counterYourself == 0;
    }

    public int lineOfWinForHorizontals(String[][] field, String playerToCheck) {
        int counterOpponent;
        int counterYourself;
        String secondPlayerRole;
        if (playerToCheck.equals("X")) {
            secondPlayerRole = "0";
        } else {
            secondPlayerRole = "X";
        }
        for (int i = 0; i < field.length; i++) {
            counterOpponent = 0;
            counterYourself = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals(playerToCheck)) {
                    counterOpponent++;

                } else if (field[i][j].equals(secondPlayerRole)) {
                    counterYourself++;
                }
                if (j == field[i].length - 1 && counterOpponent == 2 && counterYourself == 0) {
                    return i;
                }
            }
        }
        return -1;
    }

    public int lineOfWinPositionForVerticals(String[][] field, String playerToCheck) {
        String secondPlayerRole;
        int counterX;
        int counter0;
        if (playerToCheck.equals("X")) {
            secondPlayerRole = "0";
        } else {
            secondPlayerRole = "X";
        }
        for (int i = 0; i < field.length; i++) {
            counterX = 0;
            counter0 = 0;
            for (int j = 0; j < field[i].length; j++) {
                if (field[j][i].equals(playerToCheck)) {
                    counterX++;
                } else if (field[j][i].equals(secondPlayerRole)) {
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

    public void randomTactic() {
        Random random = new Random();
        this.tactic = random.nextInt(2) == 1;
    }
}
