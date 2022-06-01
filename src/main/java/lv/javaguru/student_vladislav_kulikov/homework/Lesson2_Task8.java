//Написать консольную программу, которая запрашивает
//имя пользователя и выводит на консоль текст:
//Hello имя пользователя!

package main.java.lv.javaguru.student_vladislav_kulikov.homework;

import java.util.Scanner;

public class Lesson2_Task8 {
    
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");
    }
}
