package main.java.lv.javaguru.student_vladislava_lutkevichus;
import java.util.Scanner;

public class Average {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First number is: ");
        double firstNumber = scanner.nextInt();

        System.out.print("Second number is: ");
        double secondNumber = scanner.nextInt();

        System.out.print("Third number is: ");
        double thirdNumber = scanner.nextInt();

        System.out.println((firstNumber + secondNumber + thirdNumber) / 3);
    }
}
