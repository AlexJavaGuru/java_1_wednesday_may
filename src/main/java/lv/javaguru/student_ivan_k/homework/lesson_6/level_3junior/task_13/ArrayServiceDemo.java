package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_13;

import java.util.Arrays;

public class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] array = new int[9];
        array[0] = 6;
        array[1] = 9;
        array[2] = 1;
        array[3] = 100;
        array[4] = 100;
        array[5] = 100;
        array[6] = 100;
        array[7] = 3;
        array[8] = 71;

        int xNum = arrayService.numOfOccurOfNum(array,100);
        System.out.println("Number occurrences " + xNum +" times!");
        System.out.println(Arrays.toString(array));
        boolean isChange = arrayService.replaceFirst(array,100,99999);
        System.out.println(Arrays.toString(array));
        System.out.println(isChange);
        int isAllChange = arrayService.replaceAllSamNum(array,100,777);
        System.out.println(Arrays.toString(array));
        System.out.println(isAllChange);
//        arrayService.revert(array);
        arrayService.sort(array);
        System.out.println(Arrays.toString(array));








    }
}
