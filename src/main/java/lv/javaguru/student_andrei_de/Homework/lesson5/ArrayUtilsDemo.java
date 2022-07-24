package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

import java.util.Arrays;

class ArrayUtilsDemo {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();

        int[] myArray = arrayUtils.createArray(10);

        arrayUtils.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray));

        int maxNumber =  arrayUtils.findMaxNumber(myArray);
        System.out.println(maxNumber);

        int minNumber = arrayUtils.findMinNumber(myArray);
        System.out.println(minNumber);

    }
}
