package lv.javaguru.student_artjomsb_homework.homework6.level_6_middle.tictactoe;


class TicTacToeDemo {
    public static void main(String[] args) {
        boolean playGame = true;
        while (playGame) {
            TicTacToe game = new TicTacToe();
            playGame = game.playGame();
        }
    }
}
