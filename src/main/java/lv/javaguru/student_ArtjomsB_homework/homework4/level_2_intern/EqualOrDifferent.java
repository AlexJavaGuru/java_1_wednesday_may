package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class EqualOrDifferent {
    boolean equalOrDifferent(int numberOne, int numberTwo) {
        boolean isEqual = false;
        if (numberOne == numberTwo) {
            isEqual = true;
        }
        return isEqual;
    }
    //Method without if
    boolean equalOrDifferentTwo(int numberOne, int numberTwo) {
        boolean isEqual = numberOne == numberTwo;
        return isEqual;
    }
}