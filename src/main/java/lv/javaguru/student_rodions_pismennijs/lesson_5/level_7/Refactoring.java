package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_7;

import java.util.Random;
import java.util.Scanner;

class Refactoring {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public int[] createArray(int arrayLength) {
        arrayLength = scanner.nextInt();
        return new int[arrayLength];
    }

    public void fillArrayFromConsoleNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
    }

    public void printArrayToConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Array " + i + " is " + array[i]);
        }
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public void findEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " is even");
            }
        }
    }

    public void findOddNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " is odd");
            }
        }
    }
}
