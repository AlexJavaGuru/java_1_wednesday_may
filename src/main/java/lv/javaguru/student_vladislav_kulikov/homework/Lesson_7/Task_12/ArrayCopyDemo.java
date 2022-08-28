package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_12;

import java.util.Arrays;

class ArrayCopyDemo {

    public static void main(String[] args) {
        ArrayCopy subject = new ArrayCopy();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int[] result = subject.copyInRange(array,0,0);
        System.out.println(Arrays.toString(result));
    }
}