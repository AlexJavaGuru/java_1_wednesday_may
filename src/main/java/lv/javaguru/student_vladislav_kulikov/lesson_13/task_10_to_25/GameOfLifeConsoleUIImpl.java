package lv.javaguru.student_vladislav_kulikov.lesson_13.task_10_to_25;

class GameOfLifeConsoleUIImpl implements GameOfLifeConsoleUI {

    @Override
    public void show(int[][] field) {
        for (int i = 0; i < 10 ; i++) {
            for (int j = 0; j < 10; j++) {
                if (field[i][j] == 0)
                    System.out.print(".");
                else
                    System.out.print("o");
            }
            System.out.println();
        }
        System.out.println();
    }
}
