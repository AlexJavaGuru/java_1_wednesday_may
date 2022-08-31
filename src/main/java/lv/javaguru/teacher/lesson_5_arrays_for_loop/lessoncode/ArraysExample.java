package lv.javaguru.teacher.lesson_5_arrays_for_loop.lessoncode;

import java.util.Arrays;

public class ArraysExample {

    public static void main(String[] args) {
        int[] leapYears = new int[3];
        leapYears[0] = 2020;
        leapYears[1] = 2016;
        leapYears[2] = 2012;
        System.out.println("Leap years = " + Arrays.toString(leapYears));

        double[] doubleValues = new double[4];

        doubleValues[0] = 13.4;
        doubleValues[1] = 4.3;
        doubleValues[2] = 4.37653;
        doubleValues[3] = 10.5;

        doubleValues[0] = 10000.1020;
        System.out.println("Leap years = " + Arrays.toString(doubleValues));


        String[] arrayOfStrings = new String[5];
        arrayOfStrings[0] = "Hello";
        arrayOfStrings[1] = "My";
        arrayOfStrings[2] = "Name";
        arrayOfStrings[3] = "Is";
        arrayOfStrings[4] = "Alex";
        System.out.println("Leap years = " + Arrays.toString(arrayOfStrings));
    }
}
