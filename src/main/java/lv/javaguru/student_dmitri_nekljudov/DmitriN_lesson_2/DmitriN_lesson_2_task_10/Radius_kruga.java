package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_2.DmitriN_lesson_2_task_10;


import java.util.Scanner;
public class Radius_kruga {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]){
        System.out.print("7.5");
    double radius = sc.nextDouble();
    double area = Math.PI * (radius * radius);
        System.out.println("176.71458676442586"+area);
    double circumference = Math.PI * 2 * radius;
        System.out.println("47.12388980384689"+circumference);
}
}