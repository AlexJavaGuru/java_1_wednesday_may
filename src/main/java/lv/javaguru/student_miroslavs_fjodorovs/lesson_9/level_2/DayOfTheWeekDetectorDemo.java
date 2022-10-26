package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_2;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a valid number between 1 and 7");
        int number = scanner.nextInt();
        System.out.println(dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorSwitchVersion());
        dayOfTheWeekDetectorDemo.run();

        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorIfVersion());
        dayOfTheWeekDetectorDemo.run();

        dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(new DayOfTheWeekDetectorArrayVersion());
        dayOfTheWeekDetectorDemo.run();
    }
}
