package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_2;

import java.util.Scanner;

public class DayOfTheWeekDetectorDemo {
    DayOfTheWeekDetector dayOfTheWeekDetector;

    public DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(){
        System.out.println("Enter day of the week");
        System.out.println(
                dayOfTheWeekDetector.detectDayName(
                        new Scanner(System.in).nextInt()
                )
        );
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo runner = new DayOfTheWeekDetectorDemo(
                new DayOfTheWeekDetectorIfVersionV3()
        );
        runner.run();
    }
}
