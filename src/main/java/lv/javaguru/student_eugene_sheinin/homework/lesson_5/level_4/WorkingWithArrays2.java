package lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_4;

import java.util.Random;
import java.util.Scanner;

class WorkingWithArrays2 {

    public static void main(String[] args) {

        //task25
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of array ");

        int arrayLength  = scanner.nextInt();
        int[] myArray = new int[arrayLength];

        for(int i = 0; i < arrayLength; i++) {
            System.out.println("Enter " + (i + 1) + " element of array ");
            myArray[i] = scanner.nextInt();
        }

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //task26
        Random random = new Random();

        //reuse array from 25 task
        for(int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt(25);
        }

        for(int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        //task27
        arrayLength  = random.nextInt(6);
        myArray = new int[arrayLength];


        for(int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt(25);
            System.out.println("Element with index " + i + ": " + myArray[i]);
        }

        int max = myArray[0];
        for(int i = 1; i < arrayLength; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }

        System.out.println("Max element: " + max);

        //task 28
        for(int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt(25);
            System.out.println("Element with index " + i + ": " + myArray[i]);
        }

        int min =  myArray[0];
        for(int i = 1; i < arrayLength; i++) {
            if (min > myArray[i]) {
                min = myArray[i];
            }
        }

        System.out.println("Min element: " + min);

        //task29 and 30
        for(int i = 0; i < arrayLength; i++) {
            myArray[i] = random.nextInt(25);
            System.out.println("Element with index " + i + ": " + myArray[i]);
        }

        for(int i = 0; i < arrayLength; i++) {
            if(myArray[i] % 2 == 0) {
                System.out.println("Element with index " + i + ": " + myArray[i] + " is even");
            } else {
                System.out.println("Element with index " + i + ": " + myArray[i] + " is odd");
            }
        }

    }
}
