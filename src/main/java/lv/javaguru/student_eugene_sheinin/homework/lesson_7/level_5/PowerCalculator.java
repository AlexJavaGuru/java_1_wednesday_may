package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_5;

import java.util.regex.Matcher;

class PowerCalculator {

    public static int power(int base, int pow) {
        int powerRes = base;
        for(int i = 1; i < pow; i++) {
            powerRes *= base;
        }

        return powerRes;
    }

    public static double power(double base, double pow) {
        double powerRes = base;
        for(int i = 1; i < pow; i++) {
            powerRes *= base;
        }

        return (double) Math.round(powerRes * 100)/100;
    }
}
