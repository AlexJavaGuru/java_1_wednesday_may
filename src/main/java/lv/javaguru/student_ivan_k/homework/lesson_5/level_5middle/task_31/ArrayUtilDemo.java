package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_5middle.task_31;

import java.util.Arrays;

public class ArrayUtilDemo {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();


        int[] myArray = arrayUtil.createArray(3);
        arrayUtil.printArray(myArray);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        System.out.println();
        arrayUtil.printArray(myArray);
        System.out.println(Arrays.toString(myArray));
        arrayUtil.printEvenNumbers(myArray);
        arrayUtil.findMinNumber(myArray);

    }
}
