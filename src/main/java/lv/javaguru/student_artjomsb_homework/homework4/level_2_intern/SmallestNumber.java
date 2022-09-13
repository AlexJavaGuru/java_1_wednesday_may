package lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class SmallestNumber {
    int smallestNumber(int numberOne, int numberTwo) {
        int smallestNum = numberOne;
        if (numberOne > numberTwo) {
            smallestNum = numberTwo;
        }
        return smallestNum;
    }
}
