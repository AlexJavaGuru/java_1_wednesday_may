package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class SmallestNumber {
    int smallestNumber(int numberOne, int numberTwo) {
        int smallestNum = numberOne;
        if (numberOne > numberTwo) {
            smallestNum = numberTwo;
        }
        if (numberOne == numberTwo) {
            System.out.println("Number are equal");
        }
        return smallestNum;
    }
}
