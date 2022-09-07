package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();

        System.out.printf("Your number: %d \n", num);
        if (num>0){
            System.out.println("num is positive");
        } else{
            System.out.println("num is negative");
        }
        in.close();

    }
}
