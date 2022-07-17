package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_5_and_6.ArrayUtil;
import java.util.Scanner;

class Task26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Input array length...");
        int[] array = arrayUtil.createArray(scanner.nextInt());
        arrayUtil.printArrayToConsole(array);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
    }
}
