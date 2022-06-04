//Напишите программу, которая запрашивает у пользователя
//радиус круга (вещественное число) и печатает на консоль
//периметр и площадь круга.

package main.java.lv.javaguru.student_vladislav_kulikov.homework;
import java.util.Scanner;

public class Lesson2_Task10 {

    public static void main(String[] args) {

        System.out.print("Radius: ");
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        double Pi = 3.14159265;
        double p = 2 * Pi * num;
        double s = num * num * Pi;

        System.out.println("Perimeter " + p);
        System.out.println("Area "+ s);
    }
}
