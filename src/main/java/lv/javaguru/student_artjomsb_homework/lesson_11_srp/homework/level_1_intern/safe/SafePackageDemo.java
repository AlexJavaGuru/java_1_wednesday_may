package main.java.lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_1_intern.safe;

import main.java.lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_1_intern.Safe;

class SafePackageDemo {
    public static void main(String[] args) {
        Safe safe = new Safe();
        safe.money = -100;
        //safe.pin = 0000; пример что паблик можно везде, а если без модификатора, то по дефолту package-private
    }
}
