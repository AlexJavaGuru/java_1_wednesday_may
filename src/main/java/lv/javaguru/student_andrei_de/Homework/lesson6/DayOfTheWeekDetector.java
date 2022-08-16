package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import java.util.Scanner;

    class DayOfTheWeekDetector {

        public int getDayNumberFromUser() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Input day number between 1 and 7 : ");
            return scanner.nextInt();
        }

        public String findDayOfTheWeek(int dayNumber) {
            String result = new String();
            switch (dayNumber) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Not correct day number");
            }
            return result;
        }
    }

