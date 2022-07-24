package main.java.lv.javaguru.student_anton_papin.lesson_5_homework.level_7;

import java.util.Random;
import java.util.Scanner;

public class ArrayRefactoring {

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
            array[i] = random.nextInt();
        }
    }

    public int findMaxNumber(int[] array) {
        int maxNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        return maxNum;
    }

    public int findMinNumber(int[] array) {
        int minNum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minNum) {
                minNum = array[i];
            }
        }
        return minNum;
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


