package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

class WinVertical implements Winnable {
    @Override
    public boolean isWin(Field gameField, Player playerToCheck) {
        String[][] field = gameField.getField();
        WinCounter counter = new WinCounter();
        for (int i = 0; i < field[i].length; i++) {
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
