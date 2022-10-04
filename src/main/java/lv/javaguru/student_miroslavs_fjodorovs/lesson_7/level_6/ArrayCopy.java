package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_6;

import java.util.Arrays;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] copyArray = new int[0];
        for (int i: in) {
            if (i >= numberFrom && i <= numberTo) {
                copyArray = Arrays.copyOf(copyArray, copyArray.length + 1);
                copyArray[copyArray.length - 1] = i;
            }
        }
        return copyArray;
    }
}
