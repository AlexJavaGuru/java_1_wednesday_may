package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_7;

public class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
