package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_5_6;

import java.util.Arrays;

class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil ArrayUtil = new ArrayUtil();

        int[] number = ArrayUtil.createArray(5);
        System.out.println(Arrays.toString(number));

        ArrayUtil.fillArrayWithRandomNumbers(number);
        System.out.println(Arrays.toString(number));

        ArrayUtil.printArrayToConsole(number);

        System.out.println(ArrayUtil.findMaxNumber(number));

        System.out.println(ArrayUtil.findMinNumber(number));
    }
}
