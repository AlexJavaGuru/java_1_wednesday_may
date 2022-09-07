package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        if (num %2==0){
            System.out.println("even number");

        } else {
            System.out.println("odd number");
        }

        in.close();
    }
}
