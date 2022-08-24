package lv.javaguru.student_miroslavs_fjodorovs.lesson_2;

import java.util.Scanner;

public class Task_10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Radius = ");
        double radius = scanner.nextDouble();

        System.out.println("Perimeter" + " " + "is" + " " + "=" + " " + 2 * 3.14 * radius);
        System.out.println("Area" + " " + "is" + " " + "=" + " " + 3.14 * radius * radius);

    }
}
