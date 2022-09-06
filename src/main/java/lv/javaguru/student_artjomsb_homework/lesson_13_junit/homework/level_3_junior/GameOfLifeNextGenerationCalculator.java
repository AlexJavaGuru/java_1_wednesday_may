package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_3_junior;

public class GameOfLifeNextGenerationCalculator {
    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] nextGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];
        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[0].length; j++) {
                if (currentGeneration[i][j]) {
                    nextGeneration[i][j] = countAliveNeighbors(currentGeneration, i, j) == 3 || countAliveNeighbors(currentGeneration, i, j) == 2;
                } else {
                    nextGeneration[i][j] = countAliveNeighbors(currentGeneration, i, j) == 3;
                }
            }
        }
        return nextGeneration;
    }

    private int countAliveNeighbors(boolean[][] currentGeneration, int x, int y) {
        int count = 0;
        if (checkNeighbors(currentGeneration, x - 1, y - 1)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x - 1, y)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x - 1, y + 1)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x, y - 1)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x, y + 1)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x + 1, y - 1)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x + 1, y)) {
            count++;
        }
        if (checkNeighbors(currentGeneration, x + 1, y + 1)) {
            count++;
        }
        return count;
    }

    private boolean checkNeighbors(boolean[][] currentGeneration, int x, int y) {
        if (x >= 0 && x < currentGeneration.length && y >= 0 && y < currentGeneration[0].length) {
            return currentGeneration[x][y];
        } else {
            return false;
        }
    }
}
