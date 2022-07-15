package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_5.level_2;

import java.util.Random;
import java.util.Scanner;

class WorkingWithArrays {


    public static void main(String[] args) {

        int allArraysLength = 3;

        //task 10
        int[] myArray = {2 , 5 , 8};
        for (int item : myArray) {
            System.out.println(item);
        }

        //task 11
        Scanner scanner = new Scanner(System.in);

        int[] myArray2 = new int[allArraysLength];
        for(int i = 0; i < allArraysLength; i++) {
            myArray2[i] = scanner.nextInt();
        }

        for(int i = 0; i < myArray2.length; i++) {
            System.out.println(myArray2[i]);
        }

        Random random = new Random();

        //task 12
        int[] myArray3 = new int[allArraysLength];
        for(int i = 0; i < allArraysLength; i++) {
            myArray3[i] = random.nextInt(25);
            System.out.println(myArray3[i]);
        }

        //task 13
        int sum = 0;
        int[] myArray4 = new int[allArraysLength];
        for(int i = 0; i < allArraysLength; i++) {
            myArray4[i] = random.nextInt(25);
            sum += myArray4[i];
            System.out.println(myArray4[i]);
        }

        System.out.println("Sum of myArray4 elements " + sum);

        //task 14
        sum = 0;
        int[] myArray5 = new int[allArraysLength];
        for(int i = 0; i < allArraysLength; i++) {
            myArray5[i] = random.nextInt(25);
            sum += myArray5[i];
            System.out.println(myArray5[i]);
        }

        double mean = (double) sum /  myArray5.length;
        System.out.println("Mean of myArray5 elements " + mean);

        //task 15
        int[] myArray6 = new int[allArraysLength];
        for(int i = 0; i < allArraysLength; i++) {
            myArray6[i] = random.nextInt(25);
            System.out.println(myArray6[i]);
            myArray6[i] += 2;
            System.out.println(myArray6[i]);
        }
    }
}
