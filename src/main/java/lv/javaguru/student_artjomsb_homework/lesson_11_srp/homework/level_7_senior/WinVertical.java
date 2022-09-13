package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

class WinVertical implements Winnable {
    private Field gameField;
    private Player playerToCheck;

    public WinVertical(Field gameField, Player playerToCheck) {
        this.gameField = gameField;
        this.playerToCheck = playerToCheck;
    }

    @Override
    public boolean isWin() {
        String[][] field = gameField.getField();
        WinCounter counter = new WinCounter();
        for (int i = 0; i < field[0].length; i++) {
            if (counter.isWin()) {
                return true;
            }
            counter.reset();
            for (int j = 0; j < field.length; j++) {
                if (field[j][i].equals(playerToCheck.getRole())) {
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
