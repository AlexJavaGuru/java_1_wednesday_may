package lv.javaguru.student_vadims_vilhovojs.lesson_6;

import java.util.Arrays;

class ArrayService {
    boolean contains(int[] arr, int numberToSearch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                return true;
            }

        }
        return false;

    }

    int countOccurrences(int[] arr, int numberToSearch) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToSearch) {
                result++;
            }

        }
        return result;
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
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                result++;
            }

        }
        return result;

    }

    void revert(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int tmp = arr[start];
            arr[start] = arr[end];
            arr[end] = tmp;
            start++;
            end--;
        }


    }

    void sortMinToMax(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}