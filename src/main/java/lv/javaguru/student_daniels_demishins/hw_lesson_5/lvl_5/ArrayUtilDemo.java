package lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_5;

import java.util.Arrays;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();

        int[] Array = arrayUtil.createArray(5);

        arrayUtil.fillArrayWithRandomNumbers(Array);
        System.out.println(Arrays.toString(Array));

        arrayUtil.printArrayToConsole(Array);
    }
}