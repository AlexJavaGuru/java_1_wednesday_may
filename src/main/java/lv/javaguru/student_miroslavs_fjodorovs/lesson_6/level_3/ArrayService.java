package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {

    boolean contains(int[] arr, int numberToSearch) {
        for (int i : arr) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int occurrences = 0;
        for (int i : arr) {
            if (i == numberToSearch) {
                occurrences++;
            }
        }
        return occurrences;
    }

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] arr, int numberToReplace, int newNumber) {
        int replaceCount = 0;
        for (int i = 0; i <arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                replaceCount++;
            }
        }
        return replaceCount;
    }

    void revert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    void sort(int[] arr) {
        Arrays.sort(arr);
    }
}





