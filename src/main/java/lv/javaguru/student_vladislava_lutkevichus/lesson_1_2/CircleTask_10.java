package lv.javaguru.student_vladislava_lutkevichus.lesson_1_2;
import java.util.Scanner;

public class CircleTask_10 {
    public static void main(String[] args) {
        System.out.print("Write your number: ");

        Scanner scanner = new Scanner(System.in);
        double circleRadius = scanner.nextDouble();

        final double PI =  3.14159265359d;

        System.out.println("Perimeter is = " + circleRadius * 2 * PI);
        System.out.println("Area is = " + circleRadius * circleRadius * PI);
    }
}
