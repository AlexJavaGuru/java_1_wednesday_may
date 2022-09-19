package lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_5_6;

import java.util.Random;
import java.util.Scanner;

public class ArrayUtil {
    Scanner scanner = new Scanner(System.in);
    //task26
    Random random = new Random();

    public int[] createArray(int arrayLength) {

        return new int[arrayLength];
    }

    public void fillArrayWithRandomNumbers(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }
    }

    public void printArrayToConsole(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println("Element with index " + i + ": " + array[i]);
        }
    }

    public int findMaxNumber(int[] array) {
        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
            System.out.println(array[i]);
        }

        return max;
    }

    public int findMinNumber(int[] array) {
        int min =  array[0];
        for(int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        return  min;
    }

    //refactor task 25
    public void fillArrayEnteredNumbersByUser() {
        //task25
        System.out.println("Enter length of array ");

        int arrayLength  = this.scanner.nextInt();
        int[] myArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Enter " + (i + 1) + " element of array ");
            myArray[i] = this.scanner.nextInt();
        }

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    //refactor task 26
    public void fillArrayWithRandomNumbers() {

        System.out.println("Enter length of array");

        int arrayLength  = this.scanner.nextInt();
        int[] myArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            myArray[i] = this.random.nextInt(25);
        }

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void oddOrEven(int[] array) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                System.out.println("Element with index " + i + ": " + array[i] + " is even");
            } else {
                System.out.println("Element with index " + i + ": " + array[i] + " is odd");
            }
        }
    }
}
