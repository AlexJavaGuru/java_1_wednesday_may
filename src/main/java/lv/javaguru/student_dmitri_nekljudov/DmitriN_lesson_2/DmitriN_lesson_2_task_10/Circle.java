package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_2.DmitriN_lesson_2_task_10;

import java.util.Scanner;

class Circle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Radius = 7.5 ");
        System.out.println(" Perimeter is = 47.12388980384689 ");
        System.out.println(" Area is = 176.71458676442586 ");

        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        double area = Math.PI * radius * radius;

    }
}