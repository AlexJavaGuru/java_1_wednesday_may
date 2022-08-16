package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        if(num2==num) {
            System.out.println("Numbers are equals");
        }else{
            System.out.println("Numbers are different");
        }

        in.close();
    }
}
