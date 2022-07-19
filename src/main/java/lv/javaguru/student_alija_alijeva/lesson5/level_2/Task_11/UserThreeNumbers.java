package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_2.Task_11;

import java.util.Arrays;
import java.util.Scanner;

class UserThreeNumbers {

    public static void main(String[] args) {
        int[] usersNumber = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < usersNumber.length; i++) {
            usersNumber[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(usersNumber));
    }
}

