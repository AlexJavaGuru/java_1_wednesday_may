package lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_3;

import java.sql.Array;
import java.util.Arrays;

public class ArrayService {

    //task 12
    boolean contains(int[] arr, int numberToSearch){
        for (int item: arr) {
            if (item == numberToSearch) {
                return true;
            }
        }

        return false;
    }

    //task 13
    int countOccurrences(int[] arr, int numberToSearch) {
        int occurrences = 0;
        for (int item: arr) {
            if (item == numberToSearch) {
                occurrences++;
            }
        }

        return occurrences;
    }

    //task 14
    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }

        return false;
    }

    //task 15
    int replaceAll(int[] arr, int numberToReplace, int newNumber){
        int countReplaced = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                countReplaced++;
            }
        }

        return countReplaced;
    }

    //task 16
    void revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = temp;
        }
    }

    //task 17
    void sort(int[] arr) {
        boolean isNotSorted = true;
        while(isNotSorted){
            isNotSorted = false;
            for(int i = 0; i < arr.length; i++) {
                if( (i + 1 <= arr.length - 1) && arr[i] > arr[i + 1]) {
                    isNotSorted = true;
                    int temp = arr[i];
                    arr[i] =  arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
