package lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_4;

import lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_5_and_6.ArrayUtil;
import java.util.Scanner;

class Task25 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayUtil arrayUtil = new ArrayUtil();

        System.out.println("Input array length...");
        int[] array = arrayUtil.createArray(scanner.nextInt());
        arrayUtil.printArrayToConsole(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Type " + (i + 1) + " variable");
            array[i] = scanner.nextInt();
        }

        arrayUtil.printArrayToConsole(array);

    }
}
