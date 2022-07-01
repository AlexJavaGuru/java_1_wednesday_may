package main.java.lv.javaguru.student_artjomsb_homework.homework5.level_5and6_middle;

import java.util.Arrays;
import java.util.Random;

class ArrayUtil {

    int[] createArray(int arrayLength) {
        return new int[arrayLength];
    }

    void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    void printArrayToConsole(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    int findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int number : array) {
            if (maxNumber < number) maxNumber = number;
        }
        return maxNumber;
    }

    int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int number : array) {
            if (minNumber > number) minNumber = number;
        }
        return minNumber;
    }

    int[] findOddNumbers(int[] array) {
        int[] oddNumbers = new int[0];
        for (int number : array) {
            if (number % 2 != 0) {
                oddNumbers = Arrays.copyOf(oddNumbers, oddNumbers.length + 1);
                oddNumbers[oddNumbers.length - 1] = number;
            }
        }
        return oddNumbers;
    }

    int[] findEvenNumbers(int[] array) {
        int[] evenNumbers = new int[0];
        for (int number : array) {
            if (number % 2 == 0) {
                evenNumbers = Arrays.copyOf(evenNumbers, evenNumbers.length + 1);
                evenNumbers[evenNumbers.length - 1] = number;
            }
        }
        return evenNumbers;
    }
}
