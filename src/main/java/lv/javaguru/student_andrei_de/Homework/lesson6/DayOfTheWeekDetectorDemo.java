package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import java.util.Scanner;

class DayOfTheWeekDetectorDemo {

    public static void main(String[] args) {
        DayOfTheWeekDetector detector = new DayOfTheWeekDetector();
        int dayNumber = detector.getDayNumberFromUser();
        String dayOfTheWeek = detector.findDayOfTheWeek(dayNumber);
        System.out.println(dayOfTheWeek);

        }
    }

