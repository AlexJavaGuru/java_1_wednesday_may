package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_4_to_5;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    DayOfTheWeekDetector dayOfTheWeekDetector;

    DayOfTheWeekDetectorDemo(DayOfTheWeekDetector dayOfTheWeekDetector) {
        this.dayOfTheWeekDetector = dayOfTheWeekDetector;
    }

    void run(int number) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(dayOfTheWeekDetector);

        dayOfTheWeekDetector = new DayOfTheWeekIfVersion();
        System.out.println("If Version Detector: " + dayOfTheWeekDetector.detectDayName(number));

        dayOfTheWeekDetector = new DayOfTheWeekSwitchVersion();
        System.out.println("Switch Version Detector: " + dayOfTheWeekDetector.detectDayName(number));

        dayOfTheWeekDetector = new DayOfTheWeekArrayVersion();
        System.out.println("Array Version Detector: " + dayOfTheWeekDetector.detectDayName(number));
    }

    public static void main(String[] args) {
        DayOfTheWeekDetectorDemo dayOfTheWeekDetectorDemo = new DayOfTheWeekDetectorDemo(null);

        System.out.println("Enter Number: ");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        dayOfTheWeekDetectorDemo.run(number);
    }
}
