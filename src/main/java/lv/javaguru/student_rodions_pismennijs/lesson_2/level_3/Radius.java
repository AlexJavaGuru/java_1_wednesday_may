package lv.javaguru.student_rodions_pismennijs.lesson_2.level_3;

import java.util.Scanner;

public class Radius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Radius = ");
        double radius = scanner.nextDouble();
        System.out.println("Perimeter is = " + 2 * 3.14 * radius);
        System.out.println("Area is = " + 3.14 * (radius * radius) );

    }
}
