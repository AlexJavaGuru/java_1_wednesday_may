package main.java.lv.javaguru.teacher.lesson_7_encapsulation.lessoncode;

import main.java.lv.javaguru.teacher.lesson_7_encapsulation.lessoncode.BasicCounter;

public class BasicCounterDemo {

    public static void main(String[] args) {
        BasicCounter counter = new BasicCounter();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCount());

        counter.setCounterValue(-100);
        System.out.println(counter.getCount());

    }
}
