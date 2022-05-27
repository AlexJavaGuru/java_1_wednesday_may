//Напишите программу, которая запрашивает у пользователя
//три целых числа и выводит их среднее арифметическое
//(складывает все числа и делит на их количество).
//
//Примечение: обратите внимание, что результат может быть дробным числом.

package main.java.lv.javaguru.student_vladislav_kulikov.homework;
import java.util.Scanner;
public class Lesson2_Task11 {

    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        double sum =(num1+num2+num3)/3;
        System.out.println(sum);

    }
}
