package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3;

public class DiedCellShouldLiveWith3LiveNeighboursRule extends CommonCellValidationRule implements CellValidationRule{

    @Override
    public boolean validate(boolean[][] field, int x, int y) {

        int count = getLiveNeighbourCellCount(field, x, y);

        return !field[y][x] && count == 3;
    }
}
