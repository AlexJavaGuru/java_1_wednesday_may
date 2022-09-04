package lv.javaguru.student_vladislav_kulikov.lesson_13.task_10_to_25;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    int[][] generate(int width,int length) {
        Random random = new Random();
        int[][] field = new int[width][length];

        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field.length; j++) {
                field[i][j] = random.nextInt(2);
            }
        }
        return field;
    }
}
