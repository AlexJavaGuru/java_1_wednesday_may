package lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    public void play() {
        Player player = new Player(0, 0, "X");
        String[][] field = createField();
        printFieldToConsole(field);
        while (true) {
            player.getNextMove();
            while (!field[player.getX()][player.getY()].equals("-")) {
                System.out.println("Wrong Move!");
                player.getNextMove();
            }
            field[player.getX()][player.getY()] = player.getTicTacToeRole();
            if (isWin(field, player.getTicTacToeRole())) {
                printFieldToConsole(field);
                System.out.println("Player " + player.getTicTacToeRole() + " WIN!");
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                break;
            }
            printFieldToConsole(field);
            turnToNextPlayer(player);
        }
    }

    public void playWithAI() {
        MariannaAI ticTacToeAI = new MariannaAI(0, 0, "0", true);
        ticTacToeAI.randomTactic();
        Player ticTacToePlayer = new Player(0, 0, "X");
        String[][] field = createField();
        ticTacToePlayer.chooseRole();
        if (ticTacToeAI.getTicTacToeRole().equals(ticTacToePlayer.getTicTacToeRole())) {
            ticTacToeAI.setTicTacToeRole("X");
        }
        printFieldToConsole(field);
        boolean isPlayerTurn = ticTacToePlayer.getTicTacToeRole().equals("X");
        while (true) {
            if (isPlayerTurn) {
                ticTacToePlayer.getNextMove();
                while (!field[ticTacToePlayer.getX()][ticTacToePlayer.getY()].equals("-")) {
                    System.out.println("Wrong Move!");
                    ticTacToePlayer.getNextMove();
                }
                field[ticTacToePlayer.getX()][ticTacToePlayer.getY()] = ticTacToePlayer.getTicTacToeRole();
                if (isWin(field, ticTacToePlayer.getTicTacToeRole())) {
                    System.out.println("Player " + ticTacToePlayer.getTicTacToeRole() + " WIN!");
                    printFieldToConsole(field);
                    break;
                }
                if (isDraw(field)) {
                    System.out.println("DRAW!");
                    printFieldToConsole(field);
                    break;
                }
                isPlayerTurn = false;
            } else {
                ticTacToeAI.getMove(field, ticTacToePlayer.getTicTacToeRole());
                printFieldToConsole(field);
                if (isWin(field, ticTacToeAI.getTicTacToeRole())) {
                    System.out.println("Player " + ticTacToeAI.getTicTacToeRole() + " WIN!");
                    break;
                }
                if (isDraw(field)) {
                    System.out.println("DRAW!");
                    printFieldToConsole(field);
                    break;
                }
                isPlayerTurn = true;
            }
        }
    }

    public void computerVersusComputer() {
        MariannaAI ticTacToeBot = new MariannaAI(1, 1, "X", true);
        ticTacToeBot.randomTactic();
        String[][] field = createField();
        printFieldToConsole(field);
        int turnCounter = 1;
        String playerToCheck = "0";
        while (true) {
            System.out.println(ticTacToeBot.getTicTacToeRole() + " Turn " + turnCounter);
            if (turnCounter % 2 == 0) {
                ticTacToeBot.noobMove(field);
            } else ticTacToeBot.getMove(field, playerToCheck);
            if (isWin(field, ticTacToeBot.getTicTacToeRole())) {
                System.out.println("Player " + ticTacToeBot.getTicTacToeRole() + " WIN!");
                printFieldToConsole(field);
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                printFieldToConsole(field);
                break;
            }
            playerToCheck = ticTacToeBot.getTicTacToeRole();
            turnToNextAI(ticTacToeBot);
            printFieldToConsole(field);
            turnCounter++;
        }
    }

    public boolean isWin(String[][] field, String playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForHorizontals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck);
    }

    public boolean isDraw(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j].equals("-")) {
                    return false;
                }
            }
        }
        return true;
    }

    void turnToNextPlayer(Player player) {
        if (player.getTicTacToeRole().equals("X")) {
            player.setTicTacToeRole("0");
        } else {
            player.setTicTacToeRole("X");
        }
    }

    void turnToNextAI(MariannaAI bot) {
        if (bot.getTicTacToeRole().equals("X")) {
            bot.setTicTacToeRole("0");
        } else {
            bot.setTicTacToeRole("X");
        }
    }

    public String[][] createField() {
        String[][] ticTacToeField = new String[3][3];
        for (int i = 0; i < ticTacToeField.length; i++) {
            Arrays.fill(ticTacToeField[i], "-");
        }
        return ticTacToeField;
    }

    public void printFieldToConsole(String[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (!field[i][j].equals(playerToCheck)) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (!field[j][i].equals(playerToCheck)) {
                    break;
                } else if (j == field[i].length - 1) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isWinDiagonalFromTopToBottom(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (!field[i][i].equals(playerToCheck)) {
                return false;
            }
        }
        return true;
    }

    boolean isWinDiagonalFromBottomToTop(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (!field[i][field[i].length - 1 - i].equals(playerToCheck)) {
                return false;
            }
        }
        return true;
    }

    boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
        return isWinDiagonalFromBottomToTop(field, playerToCheck) || isWinDiagonalFromTopToBottom(field, playerToCheck);
    }

    boolean playGame() {
        Scanner chooseGameOption = new Scanner(System.in);
        System.out.println("Please choose the Option: ");
        System.out.println("Player VS Player - 1");
        System.out.println("Player VS AI - 2");
        System.out.println("Ai versus AI - 3");
        System.out.println("Exit - 4");
        int gameOption = chooseGameOption.nextInt();
        switch (gameOption) {
            case 1:
                play();
                break;
            case 2:
                playWithAI();
                break;
            case 3:
                computerVersusComputer();
                break;
            case 4:
                return false;
            default:
                System.out.println("Wrong input");
        }
        return true;
    }
}
