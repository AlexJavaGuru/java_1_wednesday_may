package main.java.lv.javaguru.student_ArtjomsB_homework.lesson_2.homework.level_3_junior;
import java.util.Scanner;
public class Task10AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Request Radius
        System.out.print("Please, enter the Radius of circle:");
        double r = inp.nextDouble();
        //Perimeter calculation
        double p = 2 * Math.PI * r;
        //Only 2 number after comma
        String perimeter = String.format("%.2f",p);
        //Area calculation
        double s = Math.PI * Math.pow(r,2);
        //Only two numbers after comma
        String area = String.format("%.2f",s);
        //Data's output
        System.out.println("Perimeter = "+ perimeter);
        System.out.println("Area = " + area);
    }
}
