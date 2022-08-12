package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class ListDemo {
    public static void main(String[] args) {
        List <Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        System.out.println(numbers + " Size - " + numbers.size());
        numbers.add(1,9);
        System.out.println(numbers + " Size - " + numbers.size());
        numbers.remove((Object) 10);
        System.out.println(numbers + " Size - " + numbers.size());
        numbers.remove(1);
        System.out.println(numbers + " Size - " + numbers.size());
        System.out.println(numbers.isEmpty());
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);
        System.out.println(numbers + " Size - " + numbers.size());
        System.out.println(numbers.isEmpty());

    }

}
