package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import java.util.Arrays;

class ArrayServiceTest {

    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.findNumberIn();
        test.findNumberOut();
        test.counter();
        test.counterZero();
        test.replaceFirst();
        test.replaceFirstFalse();
        test.replaceAll();
        test.replaceAllFalse();
        test.revert();
        test.sort();

    }

    private void check(boolean condition, String testName) {
        if(condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Fail");
        }
    }

    ArrayService arrayService = new ArrayService();

    public void findNumberIn() {
        int[] array = {1,2,3,4,5};
        check(arrayService.findNumber(array, 2), "Number in array");
    }

    public void findNumberOut() {
        int[] array = {1,2,3,4,5,};
        check(!arrayService.findNumber(array, 7), "Number out array");
    }
    public void counter() {
        int[] array = {1,3,2,4,2};
        check(arrayService.countNumbers(array, 1) == 2,"Counter");
    }
    public void counterZero(){
        int[] array = {1,3,2,4,2};
        check(arrayService.countNumbers(array, 5) == 0, "Counter zero");
    }
    public void replaceFirst() {
        int[] array = {1,3,2,4,2};
        check(arrayService.replaceFirst(array,1, 6), "Replace First");
    }
    public void replaceFirstFalse() {
        int[] array = {1,3,2,4,2};
        check(arrayService.replaceFirst(array, 5 ,3), "Replace First False");
    }
    public void replaceAll(){
        int[] array = {1,3,2,4,2,5,6,1,1};
        check(arrayService.replaceAll(array, 1,8) == 4, "Replace all");
    }
    public void replaceAllFalse(){
        int[] array = {1,3,2,4,2,5,6,1,1};
        check(arrayService.replaceAll(array, 7,3) == 0, "Replace all false");
    }
    public void revert() {
        int[] array = {1,2,3,4,5};
        int[] expArray = {5,4,3,2,1};
        arrayService.revert(array);
        check(Arrays.equals(array, expArray),"Revert");
    }
    public void sort() {
        int[] array = {8,3,2,1,5,5,3,4,6,2};
        int[] expArray = {1,2,2,3,3,4,5,5,6,8};
        arrayService.sort(array);
        check(Arrays.equals(array, expArray), "Sort");
    }

}
