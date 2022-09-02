package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3_4;

public class LiveCellShouldLiveWith2Or3LiveNeighboursRule extends CommonCellValidationRule implements CellValidationRule{

    @Override
    public boolean validate(boolean[][] field, int x, int y) {

        int count = getLiveNeighbourCellCount(field, x, y);

        return field[x][y] && (count == 2 || count == 3);
    }


}
