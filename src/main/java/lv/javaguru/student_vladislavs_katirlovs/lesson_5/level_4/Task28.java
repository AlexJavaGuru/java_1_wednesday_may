package lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_5_and_6.ArrayUtil;

class Task28 {

    public static void main(String[] args) {

        ArrayUtil arrayUtil = new ArrayUtil();

        int[] array = arrayUtil.createArray(8);
        arrayUtil.fillArrayWithRandomNumbers(array);
        arrayUtil.printArrayToConsole(array);
        int minNumber = arrayUtil.findMinNumber(array);
        System.out.println(minNumber + " is the least number");
    }
}
