package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

class WinCounter {
    private int count = 0;

    public int getCount() {
        return count;
    }

    boolean isWin() {
        return count == 4;
    }

    void countPlus() {
        count++;
    }

    void reset() {
        count = 0;
    }
}
