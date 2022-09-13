package lv.javaguru.student_vladislavs_katirlovs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Scanner;

class Task11 {

    public static void main(String[] args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type first int...");
        array[0] = scanner.nextInt();
        System.out.println("Type second int...");
        array[1] = scanner.nextInt();
        System.out.println("Type third int...");
        array[2] = scanner.nextInt();
        System.out.println(Arrays.toString(array));
    }
}
