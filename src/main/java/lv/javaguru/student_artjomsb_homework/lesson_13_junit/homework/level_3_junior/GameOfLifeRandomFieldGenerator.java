package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_3_junior;

import java.util.Random;

class GameOfLifeRandomFieldGenerator {

    boolean[][] generate(int width, int height) {
        Random random = new Random();
        boolean[][] field = new boolean[width][height];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                field[i][j] = random.nextBoolean();
            }
        }
        return field;
    }
}