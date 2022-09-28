package lv.javaguru.student_vadim_zamjatin.lesson_4;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Enter integer number please: ");

        if (sc.hasNextInt()) {
            i = sc.nextInt();

            if (i % 2 == 0) {
                System.out.println("Number" + " " + i + " " + "is even");
            } else {
                System.out.println("The number is not even");
            }
        }
    }
}



