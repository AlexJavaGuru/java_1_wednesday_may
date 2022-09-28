package lv.javaguru.student_rodions_pismennijs.lesson_6.level_3;

import java.util.Arrays;

class ArrayService {

    public boolean findNumber(int[] array, int numberToSearch) {
        for (int i : array) {
            if (i == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    public int countNumbers(int[] array, int numberToSearch) {
        int count = 0;
        for (int j : array) {
            if (j == numberToSearch) {
                count++;
            }
        }
        return count;
    }

    public boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    public int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int replaceCount = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] == numberToReplace) {
                array[j] = newNumber;
                replaceCount++;
            }
        }
        return replaceCount;
    }

    public void revert(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }

    public void sort(int[] array) {
        Arrays.sort(array);
    }
}
