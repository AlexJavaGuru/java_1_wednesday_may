package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

class LargestNumber {
    int largestNumber(int numberOne, int numberTwo) {
        int largestNum = numberOne;
        if (numberOne < numberTwo) {
            largestNum = numberTwo;
        }
        return largestNum;
    }
}
