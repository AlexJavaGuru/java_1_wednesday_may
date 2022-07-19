package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_5_6;

import java.util.Arrays;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] myArray = arrayUtil.createArray(6);
        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray));
        ArrayUtil.printArrayToConsole(myArray);

        int maxNumber = arrayUtil.findMaxNumber(myArray);
        System.out.println("Max number is " + maxNumber);

        int minNumber = arrayUtil.findMinNumber(myArray);
        System.out.println("Min number is " + minNumber);

    }
}
