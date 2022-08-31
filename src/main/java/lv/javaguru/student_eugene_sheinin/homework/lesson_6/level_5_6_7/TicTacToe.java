package lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_5_6_7;

import java.util.Random;
import java.util.Scanner;

class TicTacToe {

    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();

        //task 30
        //ticTacToe.play();
        //task 33
        ticTacToe.playWithoutUser();
    }

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[i][j]) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }


    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (playerToCheck != field[j][i]) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean diagonalFromTopToBottom(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean diagonalFromBottomToTop(int[][] field, int playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (field[i][field[i].length - 1 - i] != playerToCheck) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        return diagonalFromBottomToTop(field, playerToCheck) || diagonalFromTopToBottom(field, playerToCheck);
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) ||
                isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if(field[i][j] != 0 && field[i][j] != 1) {
                    //System.out.print("---field[" + i  + "][" + j + "] = " + field[i][j] + "---");
                    return false;
                }
            }
        }

        return !this.isWinPosition(field, 0) && !this.isWinPosition(field, 1);
    }

    public int[][] createField() {
        int[][] field = new int[3][3];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = -1;
            }
        }

        return field;
    }

    //task 29
    public Move getNextMove() {
        System.out.println("Enter x coordinate from 1 - 3: ");
        int x = this.scanner.nextInt();
        System.out.println("Enter y coordinate from 1 - 3: ");
        int y = this.scanner.nextInt();

        return new Move(x - 1, y -1);
    }

    //task 33
    public Move getNextRandomMove(int[][] field) {
        Random random = new Random();
        int x = 0;
        int y = 0;
        while (field[x][y] != -1) {
//            x = random.nextInt(0, 3);
//            y = random.nextInt(0, 3);
            //System.out.println(x + " " + y + " " + field[x][y]);
        }

        System.out.println("Random " + (x + 1) + " " + (y + 1));

        return new Move(x, y);
    }

    //task 33
    public Move getNextMove(int[][] field, int playerToCheck) {
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field.length; j++){
                if((field[i][j] != 0) && (field[i][j] != 1)) {
                    int oppositePlayer = (playerToCheck == 0) ? 1 : 0;
                    field[i][j] = oppositePlayer;
                    if(this.isWinPosition(field, oppositePlayer)) {

                        System.out.println("position   x:" + (i + 1) +
                                " y:" + (j + 1) +
                                " is  win  for  player " + oppositePlayer + "! I need to prevent him from winning and taking this position!"
                        );

                        return new Move(i, j);
                    }
                    field[i][j] = -1;
                }
            }
        }

        System.out.println("Random position for player " + playerToCheck);
        return this.getNextRandomMove(field);
    }

    //task 29
    public void printFieldToConsole(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print("| " +  field[j][i]);
            }

            System.out.println();
        }
    }

    //task 30
    public void play() {
        int[][] field = createField();

        while(true) {
            printFieldToConsole(field);
            Move move0 = getNextMove();
            field[move0.getX()][move0.getY()] = 0;
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            printFieldToConsole(field);
            Move move1 = getNextMove();
            field[move1.getX()][move1.getY()] = 1;
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }

    //task 33
    public void playWithoutUser() {
        int[][] field = createField();

        while(true) {
            System.out.println("--------------");
            System.out.println("Now playing 0");
            System.out.println("1-st print for player 0");
            printFieldToConsole(field);
            //Move move0 = getNextRandomMove(field);
            Move move0 = getNextMove(field, 0);
            field[move0.getX()][move0.getY()] = 0;
            System.out.println("2-nd print for player 0");
            printFieldToConsole(field);
            if (isWinPosition(field, 0)) {
                System.out.println("Player 0 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }

            System.out.println("--------------");
            System.out.println("Now playing 1");
            System.out.println("1-st print for player 1");
            printFieldToConsole(field);
            //Move move1 = getNextRandomMove(field);
            Move move1 = getNextMove(field, 1);
            field[move1.getX()][move1.getY()] = 1;
            System.out.println("2-nd print for player 1");
            printFieldToConsole(field);
            if (isWinPosition(field, 1)) {
                System.out.println("Player 1 WIN!");
                break;
            }
            if (isDrawPosition(field)) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}
