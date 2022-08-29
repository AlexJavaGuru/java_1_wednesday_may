package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_7_senior;

import java.util.ArrayList;
import java.util.List;

class WinDetection {
    List<Winnable> winnableList;

    public WinDetection(Field gameField, Player playerToCheck) {
        winnableList = new ArrayList<>();
        winnableList.add(new WinVertical(gameField, playerToCheck));
        winnableList.add(new WinHorizontal(gameField, playerToCheck));
        winnableList.add(new WinDiagonalOne(gameField, playerToCheck));
        winnableList.add(new WinDiagonalTwo(gameField, playerToCheck));
    }

    boolean detect() {
        for (Winnable winnable : winnableList) {
            if (winnable.isWin()) {
                return true;
            }
        }
        return false;
    }
}
