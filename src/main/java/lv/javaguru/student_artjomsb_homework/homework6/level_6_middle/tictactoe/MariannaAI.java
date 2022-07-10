package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Random;

class MariannaAI {
    private int x;
    private int y;
    private String ticTacToeRole;

    MariannaAI(int x, int y,String ticTacToeRole) {
        this.x = x;
        this.y = y;
        this.ticTacToeRole = ticTacToeRole;
    }
    void getMove(String[][] field, String playerToCheck) {
        Random randomXY = new Random();
        if (checkOnBlocking(field, playerToCheck)) {
            blockOpponent(field, playerToCheck);
        } else {
            this.x = randomXY.nextInt(3);
            this.y = randomXY.nextInt(3);
        }
    }
    boolean checkOnBlocking(String[][] field, String playerToCheck) {
        return isWinForHorizontals(field, playerToCheck) != -1 || isWinPositionForVerticals(field, playerToCheck) != -1;
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
}
