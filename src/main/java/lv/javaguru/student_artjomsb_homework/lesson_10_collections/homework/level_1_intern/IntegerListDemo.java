package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_1_intern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class IntegerListDemo {
    public static void main(String[] args) {
        Random randomizer = new Random();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(11);
        numbers.add(0, 9);
        int listSize = numbers.size();
        System.out.println(listSize);
        numbers.remove((Object) 10);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        boolean isListEmpty = numbers.isEmpty();
        System.out.println(isListEmpty);
        numbers.add(randomizer.nextInt(100));
        numbers.add(randomizer.nextInt(100));
        numbers.add(randomizer.nextInt(100));
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
