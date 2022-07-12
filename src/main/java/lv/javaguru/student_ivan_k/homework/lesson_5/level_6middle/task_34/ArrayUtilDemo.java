package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_6middle.task_34;

import java.util.Arrays;

class ArrayUtilDemo {

    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();


        int[] myArray = arrayUtil.createArray(3);
        arrayUtil.printArray(myArray);
        arrayUtil.fillArrayWithRandomNumbers(myArray);
        System.out.println();
        arrayUtil.printArray(myArray);
        System.out.println(Arrays.toString(myArray));
        arrayUtil.printArrayToConsole(myArray);
        arrayUtil.findMinNumber(myArray);

    }
}
