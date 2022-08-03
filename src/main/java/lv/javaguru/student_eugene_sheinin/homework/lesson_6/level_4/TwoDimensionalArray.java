package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_4;

import java.util.Arrays;
import java.util.Random;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        int [][]  newArray = twoDimensionalArray.createTwoDimensionalArray(3, 4);
        twoDimensionalArray.fillTwoDimensionalArray(newArray);
        twoDimensionalArray.printNewArray(newArray);
    }

    int[][] createTwoDimensionalArray(int lengthX, int lengthY) {

        return new int[lengthX][lengthY];
    }

    void fillTwoDimensionalArray(int[][] array) {

        Random  random = new Random();
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(20);
            }
        }
    }

    void printNewArray(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.println("");
        }
    }
}
