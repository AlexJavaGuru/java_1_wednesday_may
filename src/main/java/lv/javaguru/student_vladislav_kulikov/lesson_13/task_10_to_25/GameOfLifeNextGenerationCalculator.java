package lv.javaguru.student_vladislav_kulikov.lesson_13.task_10_to_25;

class GameOfLifeNextGenerationCalculator {

    int[][] calculate(int[][] generation) {
         return nextGeneration(generation, generation.length, generation.length);
    }

    private int[][] nextGeneration(int[][] grid, int Width, int Height) {
        int[][] future = new int[Width][Height];

        for (int w = 0; w < Width; w++) {
            for (int h = 0; h < Height; h++) {

                int aliveNeighbours = 0;

                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if ((w + i >= 0 && w + i < Width) && (h + j >= 0 && h + j < Height)) {
                            aliveNeighbours += grid[w + i][h + j];
                        }
                        aliveNeighbours -= grid[w][h];

                        if ((grid[w][h] == 1) && (aliveNeighbours < 2)) {
                            future[w][h] = 0;
                        } else if ((grid[w][h] == 1) && (aliveNeighbours > 3)) {
                            future[w][h] = 0;
                        } else if ((grid[w][h] == 0) && (aliveNeighbours == 3)) {
                            future[w][h] = 1;
                        } else {
                            future[w][h] = grid[w][h];
                        }
                    }
                }
            }
        }
        return future;
    }
}
