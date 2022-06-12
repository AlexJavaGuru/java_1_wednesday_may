package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_3.task_11;

import java.util.Scanner;

public class Mean {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int numCount = 3;
        for(int i = 1; i <= numCount; i++) {
            System.out.println("Enter " + i + "  number:");
            sum += scanner.nextInt();
        }

        double mean = (double) sum / numCount;

        System.out.printf("Sum is " + sum + " Mean number : %.2f ", mean);
    }
}
