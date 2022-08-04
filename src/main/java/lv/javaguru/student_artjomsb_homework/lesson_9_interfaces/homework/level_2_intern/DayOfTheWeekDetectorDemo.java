package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_2_intern;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo day = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        day.run();

        day = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        day.run();

        day = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        day.run();
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please type a number between 1 and 7: ");
        int day = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(day));
    }
}