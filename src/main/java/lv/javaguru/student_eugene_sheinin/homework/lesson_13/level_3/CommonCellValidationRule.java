package lv.javaguru.student_eugene_sheinin.homework.lesson_13.level_3;

public class CommonCellValidationRule {

    int getLiveNeighbourCellCount(boolean[][] field, int x, int y) {
        int count = 0;

        for (int j = (y > 0) ? y - 1 : 0; j < Math.min((y + 2), field[x].length); j++) {
            for (int i = (x > 0) ? x - 1 : 0; i < Math.min((x + 2), field.length); i++) {
                if(field[j][i]) {
                    count += 1;
                }
            }
        }

        if(field[y][x]){
            count -= 1;
        }
        return count;
    }

}
