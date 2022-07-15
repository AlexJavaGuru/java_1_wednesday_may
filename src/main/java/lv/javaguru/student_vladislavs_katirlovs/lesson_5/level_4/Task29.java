package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_5_and_6.ArrayUtil;

class Task29 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(5);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        System.out.println("Even numbers in array are: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
