package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

class ThreeNumbersEqual {
    String numbersEquals(int numOne, int numTwo, int numThree) {
        String result = "Neither all are equal or different";
        if (numOne == numTwo && numOne == numThree) {
            result = "All numbers are equal";
        }
        else if (numOne != numTwo && numOne != numThree && numTwo != numThree) {
            result = "All numbers are different";
        }
         return result;
    }
}