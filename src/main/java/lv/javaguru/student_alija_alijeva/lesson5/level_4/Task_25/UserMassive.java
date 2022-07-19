package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_4.Task_25;

import java.util.Arrays;
import java.util.Scanner;

class UserMassive {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int [scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));
    }
}
