package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3_4;

import java.util.Random;

public class GameOfLifeRandomFieldGenerator {
    public boolean[][] generate(int width, int height) {
        Random random = new Random();

        boolean[][] newGeneration = new boolean[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                newGeneration[j][i] = random.nextBoolean();
            }

        }

        return newGeneration;
    }
}
