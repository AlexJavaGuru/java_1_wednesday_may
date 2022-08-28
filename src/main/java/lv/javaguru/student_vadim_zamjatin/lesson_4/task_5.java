package lv.javaguru.student_vadim_zamjatin.lesson_4;


import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two even number please");
        int a;
        int b;
        int max;

        System.out.println("Input First number: ");
        a = sc.nextInt();
        System.out.println("Input Second number: ");
        b = sc.nextInt();

        max = a;
        if (b > max) {
            max = b;
            System.out.println("Max number = " + max);

        } else {
            System.out.println("Max number = " + max);
        }
        }

}
