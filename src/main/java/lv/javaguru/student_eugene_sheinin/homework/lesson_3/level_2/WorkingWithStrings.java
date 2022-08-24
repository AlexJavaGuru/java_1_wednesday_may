package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_2;

import java.util.Scanner;

public class WorkingWithStrings {

    public static void main(String[] args) {

        //task 7-9
        String myName = "Eugene";
        System.out.println("Hi " + myName + " !");

        //task9
        Scanner in = new Scanner(System.in);
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Hello  " + name + " !");
    }

}
