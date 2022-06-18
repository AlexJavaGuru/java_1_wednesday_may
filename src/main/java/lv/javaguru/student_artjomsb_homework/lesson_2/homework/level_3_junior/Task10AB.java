package main.java.lv.javaguru.student_artjomsb_homework.lesson_2.homework.level_3_junior;
import java.util.Scanner;
public class Task10AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Please, enter the Radius of circle:");
        double r = inp.nextDouble();
        double p = 2 * Math.PI * r;
        String perimeter = String.format("%.2f",p);
        double s = Math.PI * Math.pow(r,2);
        String area = String.format("%.2f",s);
        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);
    }
}
