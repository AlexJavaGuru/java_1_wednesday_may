package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class ArrayTask11 {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        Scanner scanner = new Scanner(System.in);
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        System.out.println(Arrays.toString(numbers));
    }
}
