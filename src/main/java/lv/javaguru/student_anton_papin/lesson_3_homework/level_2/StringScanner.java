package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_2;

import java.util.Scanner;

class StringScanner {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println("What is your Username?");
        String username = userName.next();
        System.out.println("Hello " + username + "!");


    }
}
