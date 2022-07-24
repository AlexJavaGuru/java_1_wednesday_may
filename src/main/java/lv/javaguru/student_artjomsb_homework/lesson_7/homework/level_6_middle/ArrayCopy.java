package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_6_middle;

import java.util.Arrays;

class ArrayCopy {
    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int[] arrayToCopy = new int[0];
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                arrayToCopy = Arrays.copyOf(arrayToCopy, arrayToCopy.length + 1);
                arrayToCopy[arrayToCopy.length - 1] = in[i];
            }
        }
        return arrayToCopy;
    }
}
