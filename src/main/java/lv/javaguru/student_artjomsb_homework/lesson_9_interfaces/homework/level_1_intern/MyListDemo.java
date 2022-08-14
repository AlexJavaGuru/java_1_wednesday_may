package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;

class MyListDemo {
    public static void main(String[] args) {
        MyList arrayService = new MyListImpl();
        List<Integer> numbers
                = new ArrayList<>(3);
        arrayService.addNumber(numbers, 15);
        arrayService.addNumber(numbers, 20);
        arrayService.addNumber(numbers, 30);
        arrayService.addNumber(numbers, 20);
        arrayService.addNumber(numbers, 25);
        arrayService.addNumber(numbers, 15);
        arrayService.addNumber(numbers, 15);
        arrayService.addNumber(numbers, 35);
        arrayService.addNumber(numbers, 15);
        System.out.println(numbers + " Size - " + numbers.size());
        System.out.println(arrayService.findMostFrequentNumber(numbers));
        System.out.println("---------------------------------");
        arrayService.increaseArraySize(numbers, 5);
        System.out.println(numbers.size());
    }
}
