package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

public class WinDiagonalOne implements Winnable {
    private Field gameField;
    private Player playerToCheck;

    public WinDiagonalOne(Field gameField, Player playerToCheck) {
        this.gameField = gameField;
        this.playerToCheck = playerToCheck;
    }

    @Override
    public boolean isWin() {
        String[][] field = gameField.getField();
        WinCounter counter = new WinCounter();
        for (int i = 0; i < field.length / 2; i++) {
            for (int j = 0; j < field[0].length / 2; j++) {
                if (counter.isWin()) {
                    return true;
                }
                for (int k = 0; k < 4; k++) {
                    if (field[i + k][j + k].equals(playerToCheck.getRole())) {
                        counter.countPlus();
                    } else {
                        counter.reset();
                        break;
                    }
                }
            }
        }
        return false;
    }
}
