package lv.javaguru.student_artjomsb_homework.homework6.level_3_junior;

import java.util.Arrays;

class ArrayService {
    boolean isArrayContains(int[] arr, int numberToSearch) {
        for (int numbers : arr) {
            if (numbers == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int numberCounterInArray(int[] arr, int numberToFind) {
        int numberCounter = 0;
        for (int number : arr) {
            if (number == numberToFind) {
                numberCounter++;
            }
        }
        return numberCounter;
    }

    boolean replaceNumberInArray(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int[] replaceNumbersInArray(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
        return arr;
    }

    void reverseArray(int[] arr) {
        int memorizeOfNumber;
        for (int i = 0; i < arr.length / 2; i++) {
            memorizeOfNumber = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = memorizeOfNumber;
        }
    }

    void sortArrayCheating(int[] arr) {
        Arrays.sort(arr);
    }

    void sortArray(int[] arr) {
        int memorizeOfNumber;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    memorizeOfNumber = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = memorizeOfNumber;
                }
            }
        }
    }
}
