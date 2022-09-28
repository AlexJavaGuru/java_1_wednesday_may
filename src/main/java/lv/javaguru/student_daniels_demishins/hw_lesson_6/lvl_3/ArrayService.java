package lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_3;

public class ArrayService {
    boolean isArrayNumbers(int[] arr, int numberToSearch) {
        for (int numbers : arr) {
            if (numbers == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countNumbersInArray(int[] arr, int numberToSearch) {
        int count = 0;
        for (int numbers : arr) {
            if (numbers == numberToSearch) {
                count++;

            }
        }
        return count;
    }


    boolean replaceFirstInArray(int[] arr, int numberToReplace, int newNumber) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }

        }
        return false;
    }

    int[] replaceAllNumbersInArray(int[] arr, int numbersToReplace, int newNumbers) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numbersToReplace) {

            }

        }
        return arr;
    }
}
