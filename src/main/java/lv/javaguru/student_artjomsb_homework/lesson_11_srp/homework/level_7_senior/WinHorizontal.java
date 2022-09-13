package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

class WinHorizontal implements Winnable {

    private Field gameField;
    private Player playerToCheck;

    public WinHorizontal(Field gameField, Player playerToCheck) {
        this.gameField = gameField;
        this.playerToCheck = playerToCheck;
    }

    @Override
    public boolean isWin() {
        String[][] field = gameField.getField();
        WinCounter counter = new WinCounter();
        for (int i = field.length - 1; i >= 0; i--) {
            if (counter.isWin()) {
                return true;
            }
            counter.reset();
            for (int j = 0; j < field[0].length; j++) {
                if (field[i][j].equals(playerToCheck.getRole())) {
                    counter.countPlus();
                } else if (counter.isWin()) {
                    return true;
                } else {
                    counter.reset();
                }
            }
        }
        return false;
    }
}
