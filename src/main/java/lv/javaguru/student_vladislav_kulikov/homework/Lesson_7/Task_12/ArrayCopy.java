package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_12;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] <= numberTo && in[i] >= numberFrom) {
                count++;
            }
        }

        int[] copy = new int[count];

        for (int i = 0, j = 0; i < in.length; i++) {
            if (in[i] <= numberTo && in[i] >= numberFrom) {
                copy[j] = in[i];
                j++;
            }
        }
        return copy;
    }
}
