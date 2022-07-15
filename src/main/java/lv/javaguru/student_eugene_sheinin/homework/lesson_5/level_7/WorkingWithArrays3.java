package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_7;

import main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_5_6.ArrayUtil;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class WorkingWithArrays3 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        //refactor task 25
        arrayUtil.fillArrayEnteredNumbersByUser();

        //refactor task 26
        arrayUtil.fillArrayWithRandomNumbers();

        //refactor task 27
        int[] myArray = new int[new Random().nextInt(6)];

        arrayUtil.fillArrayWithRandomNumbers(myArray);

        System.out.println(Arrays.toString(myArray));

        int max = arrayUtil.findMaxNumber(myArray);

        System.out.println("Max element: " + max);

        //refactor task 28
        int min = arrayUtil.findMinNumber(myArray);

        System.out.println("Min element: " + min);

        //task29 and 30
        arrayUtil.oddOrEven(myArray);
    }
}
