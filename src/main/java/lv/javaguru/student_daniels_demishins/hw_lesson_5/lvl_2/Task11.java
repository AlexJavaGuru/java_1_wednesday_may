package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_2;

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        int[] arrayNumber = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arrayNumber.length; i++) {
            arrayNumber[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arrayNumber));
    }
}
