package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3;

public class GameOfLifeNextGenerationCalculator {

    public boolean[][] calculate(boolean[][] currentGeneration) {
        boolean[][] newGeneration = new boolean[currentGeneration.length][currentGeneration[0].length];

        for (int i = 0; i < currentGeneration.length; i++) {
            for (int j = 0; j < currentGeneration[i].length; j++) {
                newGeneration[j][i] = cellShouldLive(currentGeneration, i, j);
            }
        }

        return newGeneration;
    }

    boolean cellShouldLive(boolean[][] currentGeneration, int x, int y) {
        //     redundant rules
        //     boolean shouldDieRule1 = new LiveCellShouldDieWithLessThen2LiveNeighboursRule().validate(currentGeneration, x, y);
        //     boolean shouldDieRule2 = new LiveCellShouldDieWithMoreThen3LiveNeighboursRule().validate(currentGeneration, x, y);
        boolean shouldLiveRule1 = new LiveCellShouldLiveWith2Or3LiveNeighboursRule().validate(currentGeneration, x, y);
        boolean shouldLiveRule2 = new DiedCellShouldLiveWith3LiveNeighboursRule().validate(currentGeneration, x, y);

        return shouldLiveRule1 || shouldLiveRule2;
    }


}
