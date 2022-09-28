package lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_2.task_8;

import java.util.Scanner;

public class HelloFromConsole {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Your string: " + name);
    }

}
