package lv.javaguru.student_eugene_sheinin.homework.lesson_2.level_3.task_10;

import java.util.Scanner;
import java.lang.Math;

public class CircleCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius number:");
        double radius = scanner.nextDouble();
        double perimeter =  2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

        System.out.println(" radius: " + radius + " perimeter: " + perimeter + " area: " + area) ;
    }
}
