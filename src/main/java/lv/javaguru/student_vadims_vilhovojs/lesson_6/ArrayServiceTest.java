package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_6;

import java.util.Arrays;

class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest test = new ArrayServiceTest();
        test.containsTrue();
        test.containsFalse();
        test.countOccurrences();
        test.replaceFirst();
        test.replaceAll();
        test.revert();
        test.sortMinToMax();

    }

    public void containsTrue() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {7, 8, 9, 10, 12};
        int numberToSearch = 10;
        boolean expectedResult = true;
        boolean actualResult = arrayService.contains(arr, numberToSearch);
        if (actualResult == true) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

        }
    }

    public void containsFalse() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {7, 8, 9, 10, 12};
        int numberToSearch = 15;
        boolean expectedResult = false;
        boolean actualResult = arrayService.contains(arr, numberToSearch);
        if (actualResult == false) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

        }

    }

    public void countOccurrences() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {7, 8, 9, 10, 10, 10, 16};
        int numberToSearch = 10;
        int expectedResult = 3;
        int actualResult = arrayService.countOccurrences(arr, numberToSearch);
        if (actualResult == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

        }


    }

    public void replaceFirst() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {7, 8, 9, 10, 10, 10, 16};
        int numberToReplace = 8;
        int newNumber = 66;
        boolean expectedResult = true;
        boolean actualResult = arrayService.replaceFirst(arr, numberToReplace, newNumber);
        if (actualResult == true) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");

        }


    }

    public void replaceAll() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {7, 8, 9, 10, 10, 10, 16};
        int numberToReplace = 10;
        int newNumber = 66;
        int expectedResult = 3;
        int actualResult = arrayService.replaceAll(arr, numberToReplace, newNumber);
        if (actualResult == 3) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");


        }
    }

    public void revert() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {7, 6, 5, 12, 13, 14, 16};
        arrayService.revert(arr);
        System.out.println("Expected result - [16, 14, 13, 12, 5, 6, 7]\n Actual result - " + Arrays.toString(arr));


    }

    public void sortMinToMax() {
        ArrayService arrayService = new ArrayService();
        int[] arr = {25, 6, 86, 4, 37, 2, 1};
        arrayService.sortMinToMax(arr);
        System.out.println("Expected result - [1, 2, 4, 6, 25, 37, 86]\n Actual result - " + Arrays.toString(arr));
    }
}