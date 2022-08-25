package lv.javaguru.student_ivan_k.homework.lesson_4.level_1intern.task_2;

import java.util.Scanner;

public class PoNoNull {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter any number please: ");
            int number = scanner.nextInt();


            if (number > 0 ){
                System.out.println("Your number is positive");
            } else if (number < 0) {
                System.out.println("Your number is negative");
            } else {
                System.out.println("Your number is null");
            }




        }
}
