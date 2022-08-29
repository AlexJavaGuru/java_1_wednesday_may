package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

import java.util.Random;

class Game {
    private Field field;
    private Player playerOne;
    private Player playerTwo;
    private Player playerTurn;

    Game() {
        this.field = new Field();
        this.playerOne = new Player("Player 1", "X");
        this.playerTwo = new Player("Player 2", "0");
    }

    void play() {
        new Game();
        playerTurn = playerOne;
        while (true) {
            //  Random random = new Random();
            field.printField();
            System.out.println(playerTurn.getName() + " Turn!");
            Move move = new Move(playerTurn.askForMove());
            //Move move = new Move(random.nextInt(7));
            if (field.isMovePossible(move)) {
                field.makeMove(move, playerTurn);
            } else {
                System.out.println("Move not possible!");
                continue;
            }
            WinDetection isWin = new WinDetection(field, playerTurn);
            if (isWin.detect()) {
                System.out.println(playerTurn.getName() + " WIN!");
                field.printField();
                break;
            } else if (field.isDraw()) {
                System.out.println("DRAW!");
                field.printField();
                break;
            }
            nextPlayerTurn();
        }
    }

    private void nextPlayerTurn() {
        if (playerTurn.equals(playerOne)) {
            playerTurn = playerTwo;
        } else {
            playerTurn = playerOne;
        }
    }
}
