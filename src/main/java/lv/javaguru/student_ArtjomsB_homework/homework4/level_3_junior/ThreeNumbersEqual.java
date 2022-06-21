package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

public class ThreeNumbersEqual {
    String numbersEquals(int numOne, int numTwo, int numThree) {
        String result = "Neither all are equal or different";
        boolean isEqual = numOne == numTwo && numOne == numThree;
        boolean isNotEqual = numOne != numTwo && numOne != numThree && numTwo != numThree;
        if (isEqual) {
            result = "All numbers are equal";
        }
        if (isNotEqual) {
            result = "All numbers are different";
        }
        return result;
    }
}
