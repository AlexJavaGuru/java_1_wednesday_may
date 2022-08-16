package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;
import java.util.Scanner;
public class task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = in.nextInt();
        System.out.print("Input a number: ");
        int num2 = in.nextInt();
        System.out.print("Input a number: ");
        int num3 = in.nextInt();
        if (num3>num2 && num3>num){
            System.out.println(num3);
        } else if (num2>num3 && num2>num){
            System.out.println(num2);
        } else {
            System.out.println(num);
        }
        in.close();
    }
}
