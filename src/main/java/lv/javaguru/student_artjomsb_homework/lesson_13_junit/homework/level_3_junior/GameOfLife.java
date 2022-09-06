package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_3_junior;

import java.util.concurrent.TimeUnit;

class GameOfLife {
    private GameOfLifeConsoleUI ui = new GameOfLifeConsoleUI();
    private GameOfLifeRandomFieldGenerator generator = new GameOfLifeRandomFieldGenerator();
    private GameOfLifeNextGenerationCalculator calculator = new GameOfLifeNextGenerationCalculator();

    public void run() {
        boolean[][] field = generator.generate(10, 10);
        while (true) {
            ui.show(field);
            if (!isFieldAlive(field)) {
                break;
            }
            sleepForSeconds(1);
            field = calculator.calculate(field);
        }
    }

    private void sleepForSeconds(int seconds) {
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            System.out.println("Exception occurred!");
            System.exit(1);
        }
    }

    private boolean isFieldAlive(boolean[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}