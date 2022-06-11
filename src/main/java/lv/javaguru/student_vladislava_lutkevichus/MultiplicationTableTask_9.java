package main.java.lv.javaguru.student_vladislava_lutkevichus;
import java.util.Scanner;

public class MultiplicationTableTask_9 {
    public static void main(String[] args) {
        System.out.print("Input data: ");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        /* Easy version
        System.out.println(number + " * 1 = " + (number * 1));
        System.out.println(number + " * 2 = " + (number * 2));
        System.out.println(number + " * 3 = " + (number * 3));
        System.out.println(number + " * 4 = " + (number * 4));
        System.out.println(number + " * 5 = " + (number * 5));
        System.out.println(number + " * 6 = " + (number * 6));
        System.out.println(number + " * 7 = " + (number * 7));
        System.out.println(number + " * 8 = " + (number * 8));
        System.out.println(number + " * 9 = " + (number * 9));
        System.out.println(number + " * 10 = " + (number * 10));
        */

        int result;
        for ( int i = 1; i <=10 ; i++){
            result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }

    }

}
