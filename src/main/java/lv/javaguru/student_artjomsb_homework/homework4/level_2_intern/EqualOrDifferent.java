package lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class EqualOrDifferent {
    boolean isEqual(int numberOne, int numberTwo) {
        boolean isEqual = false;
        if (numberOne == numberTwo) {
            isEqual = true;
        }
        return isEqual;
    }
    //Method without if
    boolean isEqualTwo(int numberOne, int numberTwo) {
        return numberOne == numberTwo;
    }
}