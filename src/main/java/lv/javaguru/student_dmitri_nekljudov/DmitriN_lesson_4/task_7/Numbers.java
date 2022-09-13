package lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_7;

import java.util.Scanner;

class Numbers {

    public static void main(String[] args) {

        System.out.print("write 2 numbers: ");
        Scanner scanner = new Scanner(System.in);
        int numberO = scanner.nextInt();
        int numberT = scanner.nextInt();

        if (numberO == numberT) {
            System.out.println("Numbers are equals");
        } else {
            System.out.println("Numbers are different");
        }
    }
}



