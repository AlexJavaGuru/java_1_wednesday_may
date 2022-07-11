package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;

import java.util.Arrays;
import java.util.Scanner;

class TicTacToe {
    /*  public void play() {
          Player playerOne = new Player(0, 0, "-");
          Player playerTwo = new Player(0, 0, "-");
          playerOne.chooseRole();
          if (playerOne.getTicTacToeRole().equals("X")) {
              playerTwo.setTicTacToeRole("0");
          } else {
              playerTwo.setTicTacToeRole("X");
          }
          String[][] field = createField();
          printFieldToConsole(field);
          while (true) {
              playerOne.getNextMove();
              while (field[playerOne.getX()][playerOne.getY()].equals("X") || field[playerOne.getX()][playerOne.getY()].equals("0")) {
                  System.out.println("Wrong Move!");
                  playerOne.getNextMove();
              }
              field[playerOne.getX()][playerOne.getY()] = playerOne.getTicTacToeRole();
              if (isWin(field, playerOne.getTicTacToeRole())) {
                  printFieldToConsole(field);
                  System.out.println("Player " + playerOne.getTicTacToeRole() + " WIN!");
                  break;
              }
              if (isDraw(field)) {
                  System.out.println("DRAW!");
                  break;
              }

              printFieldToConsole(field);
              playerTwo.getNextMove();
              while (field[playerTwo.getX()][playerTwo.getY()].equals("X") || field[playerTwo.getX()][playerTwo.getY()].equals("0")) {
                  System.out.println("Wrong Move!");
                  playerTwo.getNextMove();
              }
              field[playerTwo.getX()][playerTwo.getY()] = playerTwo.getTicTacToeRole();
              printFieldToConsole(field);
              if (isWin(field, playerTwo.getTicTacToeRole())) {
                  printFieldToConsole(field);
                  System.out.println("Player " + playerTwo.getTicTacToeRole() + " WIN!");
                  break;
              }
              if (isDraw(field)) {
                  System.out.println("DRAW!");
                  break;
              }
          }
      }*/
    public void play() {
        Player player = new Player(0, 0, "X");
        String[][] field = createField();
        printFieldToConsole(field);
        while (true) {
            player.getNextMove();
            while (field[player.getX()][player.getY()].equals("X") || field[player.getX()][player.getY()].equals("0")) {
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
        MariannaAI ticTacToeAI = new MariannaAI(0, 0, "0");
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
                while (field[ticTacToePlayer.getX()][ticTacToePlayer.getY()].equals("X") || field[ticTacToePlayer.getX()][ticTacToePlayer.getY()].equals("0")) {
                    System.out.println("Wrong Move!");
                    ticTacToePlayer.getNextMove();
                }
                field[ticTacToePlayer.getX()][ticTacToePlayer.getY()] = "X";
                if (isWin(field, "X")) {
                    printFieldToConsole(field);
                    System.out.println("Player X WIN!");
                    break;
                }
                if (isDraw(field)) {
                    System.out.println("DRAW!");
                    break;
                }
                isPlayerTurn = false;
            } else {
                printFieldToConsole(field);
                ticTacToeAI.getMove(field, "X");
                while (field[ticTacToeAI.getX()][ticTacToeAI.getY()].equals("X") || field[ticTacToeAI.getX()][ticTacToeAI.getY()].equals("0")) {
                    ticTacToeAI.getMove(field, "X");
                }
                field[ticTacToeAI.getX()][ticTacToeAI.getY()] = "0";
                printFieldToConsole(field);
                if (isWin(field, "0")) {
                    printFieldToConsole(field);
                    System.out.println("Player 0 WIN!");
                    break;
                }
                if (isDraw(field)) {
                    printFieldToConsole(field);
                    System.out.println("DRAW!");
                    break;
                }
                isPlayerTurn = true;
            }
        }
    }

    public void computerVersusComputer() {
        MariannaAI ticTacToeAI = new MariannaAI(0, 0, "0");
        MariannaAI ticTacToeBot = new MariannaAI(1, 1, "X");
        String[][] field = createField();
        printFieldToConsole(field);
        int turnCounter = 1;
        String playerToCheck = "0";
        while (true) {
            System.out.println(ticTacToeBot.getTicTacToeRole() + " Turn " + turnCounter);
            ticTacToeBot.getMove(field, playerToCheck);
            while (field[ticTacToeBot.getX()][ticTacToeBot.getY()].equals("X") || field[ticTacToeBot.getX()][ticTacToeBot.getY()].equals("0")) {
                ticTacToeBot.getMove(field, playerToCheck);
            }
            field[ticTacToeBot.getX()][ticTacToeBot.getY()] = ticTacToeBot.getTicTacToeRole();
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
            turnCounter++;-
/*
printFieldToConsole(field);
            System.out.println("0 Turn " + turnCounter);
            ticTacToeAI.getMove(field, "X");
            while (field[ticTacToeAI.getX()][ticTacToeAI.getY()].equals("X") || field[ticTacToeAI.getX()][ticTacToeAI.getY()].equals("0")) {
                ticTacToeAI.getMove(field, "X");
            }
            field[ticTacToeAI.getX()][ticTacToeAI.getY()] = "0";
            printFieldToConsole(field);
            if (isWin(field, "0")) {
                System.out.println("Player 0 WIN!");
                printFieldToConsole(field);
                break;
            }
            if (isDraw(field)) {
                System.out.println("DRAW!");
                printFieldToConsole(field);
                break;
            }
            turnCounter++;*/
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


    public boolean isWinPositionForHorizontals(String[][] field, String playerToCheck) {
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

    public boolean isWinPositionForVerticals(String[][] field, String playerToCheck) {
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

    public boolean diagonalFromTopToBottom(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (!field[i][i].equals(playerToCheck)) {
                return false;
            }
        }
        return true;
    }

    public boolean diagonalFromBottomToTop(String[][] field, String playerToCheck) {
        for (int i = 0; i < field.length; i++) {
            if (!field[i][field[i].length - 1 - i].equals(playerToCheck)) {
                return false;
            }
        }
        return true;
    }

    public boolean isWinPositionForDiagonals(String[][] field, String playerToCheck) {
        return diagonalFromBottomToTop(field, playerToCheck) || diagonalFromTopToBottom(field, playerToCheck);
    }

    void chooseTheGameOption() {
        Scanner chooseGameOption = new Scanner(System.in);
        System.out.println("Please choose the Option: ");
        System.out.println("Player VS Player - 1");
        System.out.println("Player VS AI - 2");
        System.out.println("Ai versus AI - 3");
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
            default:
                System.out.println("Wrong input");
        }
    }
}
