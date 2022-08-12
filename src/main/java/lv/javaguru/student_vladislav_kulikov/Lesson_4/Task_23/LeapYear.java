package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_23;

class LeapYear {

    public boolean isLeapYear(int year) {
        if (year % 4 > 0) {
            return false;
        }else if (year % 100 > 0) {
            return true;
        }else if (year % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
