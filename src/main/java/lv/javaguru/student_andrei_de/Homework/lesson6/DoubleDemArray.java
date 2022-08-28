package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import java.util.Random;

public class DoubleDemArray {

    public static void main(String[] args) {

            int[][] array = new int[3][3];

            Random random = new Random();
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = random.nextInt(10);
                }
            }

            printArray(array);

            int[][] arrayTwo = {{9, 8, 7},
                    {6, 5, 4},
                    {3, 2, 1}};

//        printArray(arrayTwo);
        }

        public static void printArray(int[][] array) {
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                    System.out.print(" | ");
                }
                System.out.println();
            }
        }
    }
