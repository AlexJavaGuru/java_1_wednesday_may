package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

class ArrayCopy {


    int[] copyInRange(int[] in, int numberFrom, int numberTo) {
        int count = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= numberFrom && in[i] <= numberTo) {
                count++;
            }


        }

        int finalArray[] = new int[count];
        int index = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] > numberFrom - 1 && in[i] < numberTo + 1) {
                finalArray[index] = in[i];
                index++;
            }
        }
        return finalArray;
    }

}
