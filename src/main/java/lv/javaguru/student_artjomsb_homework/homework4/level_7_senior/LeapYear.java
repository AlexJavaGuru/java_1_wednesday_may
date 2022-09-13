package lv.javaguru.student_artjomsb_homework.homework4.level_7_senior;

class LeapYear {
    boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0) {
            return true;
        }
        return year % 400 == 0;
    }

}
