package main.java.lv.javaguru.student_rodions_pismennijs.lesson_5.level_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class ArrayTask26 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] number = new int[scanner.nextInt()];

        Random random = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(25);
        }

        System.out.println(Arrays.toString(number));
    }
}
