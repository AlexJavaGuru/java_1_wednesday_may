package lv.javaguru.student_alija_alijeva.lesson3.homework.level_2.task_9;

import java.util.Scanner;

class FirstScanner {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Your name is ");
        String userName = name.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
