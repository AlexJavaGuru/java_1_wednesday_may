package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyListTest {
    public static void main(String[] args) {
        MyListTest runner = new MyListTest();
        runner.sortMinMax();
        runner.sortMaxMin();
        runner.getArraySize();
        runner.deleteNumber();
        runner.deleteNumberByID();
        runner.findMostFrequentNumber();
        runner.addNumber();
    }

    public void sortMinMax() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1));
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(-10, -5, 1, 3, 5));
        arrayUtil.sortMinMax(testArray);
        check(expectedResult.equals(testArray), "Test sorting min to max");
    }

    public void sortMaxMin() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1));
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, 3, 1, -5, -10));
        arrayUtil.sortMaxMin(testArray);
        check(expectedResult.equals(testArray), "Test sorting max to min");
    }

    public void getArraySize() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1));
        int expectedResult = 5;
        int actualResult = arrayUtil.getArraySize(testArray);
        check(expectedResult == actualResult, "Test check array size");
    }

    public void deleteNumberByID() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1));
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, -10, 3, 1));
        arrayUtil.deleteNumberByID(testArray, 3);
        check(expectedResult.equals(testArray), "Test delete by ID");
    }

    public void deleteNumber() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1));
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, 3, -5, 1));
        arrayUtil.deleteNumber(testArray, -10);
        check(expectedResult.equals(testArray), "Test delete number");
    }

    public void findMostFrequentNumber() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, 33, -10, 33, -5, 1, -10, 33));
        int expectedResult = 33;
        int actualResult = arrayUtil.findMostFrequentNumber(testArray);
        check(expectedResult == actualResult, "Test find most common number");
    }

    public void addNumber() {
        MyList arrayUtil = new MyListImpl();
        List<Integer> testArray = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1));
        List<Integer> expectedResult = new ArrayList<>(Arrays.asList(5, -10, 3, -5, 1, 34));
        arrayUtil.addNumber(testArray, 34);
        check(expectedResult.equals(testArray), "Test add number");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
