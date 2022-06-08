package main.java.lv.javaguru.student_ivan_k.homework.lesson_2;

//Напишите программу, которая запрашивает у пользователя
//        радиус круга (вещественное число) и печатает на консоль
//        периметр и площадь круга.
//
//        Test Data:
//        Radius = 7.5
//
//        Expected Output
//        Perimeter is = 47.12388980384689
//        Area is = 176.71

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle :");
        Scanner scanner = new Scanner(System.in);
        double radiusCircle = scanner.nextDouble();
        double perimeter =  2 * 3.14 * radiusCircle;
        double area = 3.14  * ( radiusCircle * radiusCircle);
        System.out.println("Perimeter of the circle is : " + perimeter);
        System.out.println("Area of the circle is : " + area);
    }


}
