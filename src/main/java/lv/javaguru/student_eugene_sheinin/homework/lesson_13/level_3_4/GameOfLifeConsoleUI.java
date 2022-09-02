package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3_4;

public class GameOfLifeConsoleUI {
    public void show(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print((field[j][i]) ? "\u001B[32m" + "|X|" + "\u001B[0m" : "|0|");
            }
            System.out.println("");
        }

        System.out.println("\n_______________________________\n");
    }
}
