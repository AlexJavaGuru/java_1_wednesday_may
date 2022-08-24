package lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_3;

import java.util.Scanner;

class DayOfWeek {

    public static void main(String[] args) {

        System.out.print("Put number 1,2,3,4,5,6,7 : ");
        Scanner inputFigure = new Scanner(System.in);
        int i = inputFigure.nextInt();

        if (i == 1)
            System.out.println("Monday");
        if (i == 2)
            System.out.println("Tuesday");
        if (i == 3)
            System.out.println("Wednesday");
        if (i == 4)
            System.out.println("Thursday");
        if (i == 5)
            System.out.println("Friday");
        if (i == 6)
            System.out.println("Saturday");
        if (i == 7)
            System.out.println("Sunday");
    }
}

