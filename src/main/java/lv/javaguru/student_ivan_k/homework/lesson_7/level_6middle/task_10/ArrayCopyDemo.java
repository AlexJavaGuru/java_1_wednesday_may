package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

import java.util.Arrays;

class ArrayCopyDemo {
    public static void main(String[] args) {
        ArrayCopy arrayCopy = new ArrayCopy();
        int[] testArray = {2,3,4,5,6,7,9,11,13,16,3,33,44,55,50,66,77,88,82,87,89,100};
        int[] result = arrayCopy.copyInRange(testArray,10,50);
        System.out.println(Arrays.toString(result));


    }
}
