package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_5;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] Array = arrayUtil.createArray(10);

        arrayUtil.fillArrayWithRandomNumbers(Array);
        System.out.println(Arrays.toString(Array));

        /* Task 34 */
        arrayUtil.printArrayYoConsole(Array);
        System.out.println(Arrays.toString(Array));


        int max = arrayUtil.findMaxNumber(Array);
        System.out.println("Max number is - " + max);

    }

}