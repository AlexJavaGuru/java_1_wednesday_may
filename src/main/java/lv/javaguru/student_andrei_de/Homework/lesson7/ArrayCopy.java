package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;


import java.util.Arrays;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {

        int[] newArray = new int[0];
        for (int j : in) {
            if (j>= numberFrom && j <= numberTo) {
                newArray = Arrays.copyOf(newArray, newArray.length + 1);
                newArray[newArray.length - 1] = j;
            }
        }
        return newArray;
    }
}
