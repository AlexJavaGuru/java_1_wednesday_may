package lv.javaguru.student_rodions_pismennijs.lesson_4.level_7;

class LeapYear {
    public boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 4 == 0 && year % 100 == 0 && year % 400 == 0;
    }
}
