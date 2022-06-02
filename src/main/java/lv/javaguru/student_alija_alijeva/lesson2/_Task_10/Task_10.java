package main.java.lv.javaguru.student_alija_alijeva.lesson2._Task_10;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Radius: ");
        double rad = scanner.nextDouble();
        double per = 2 *Math.PI *rad;
        double area = Math.PI * rad * rad;
        System.out.println("Perimeter is " + per);
        System.out.println("Area is " + area);
    }
}
