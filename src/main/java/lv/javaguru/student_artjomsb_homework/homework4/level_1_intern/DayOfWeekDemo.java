package lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;

import java.util.Scanner;

class DayOfWeekDemo {
    public static void main(String[] args) {
        DayOfWeek day = new DayOfWeek();
        Scanner newScanner = new Scanner(System.in);
        System.out.print("Input number from 1 to 7: ");
        int numberOfDay = newScanner.nextInt();
        day.dayOfWeek(numberOfDay);
        System.out.println("Check program Number two");
        day.dayOfWeekTwo(numberOfDay);
    }
}
