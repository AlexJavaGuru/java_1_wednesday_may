package lv.javaguru.student_anton_papin.lesson_2_homework.level_2;

import java.util.Scanner;

public class HelloUsername {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter your username, please.");
        String nameA = scanner.next();
        System.out.println("Hello " + nameA);
    }
}
