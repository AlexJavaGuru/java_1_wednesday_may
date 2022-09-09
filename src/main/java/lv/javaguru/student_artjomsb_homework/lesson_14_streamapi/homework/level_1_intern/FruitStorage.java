package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern;

import lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern.applepredicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class FruitStorage {

    public List<Apple> getAllApples() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("red", 100));
        apples.add(new Apple("red", 160));
        apples.add(new Apple("red", 200));
        apples.add(new Apple("green", 200));
        apples.add(new Apple("green", 90));
        apples.add(new Apple("green", 50));
        apples.add(new Apple("yellow", 50));
        apples.add(new Apple("yellow", 170));
        return apples;
    }

    List<Apple> getApplesByColor(String color) {
        return getAllApples().stream()
                .filter(apple -> color.toLowerCase().equals(apple.getColor()))
                .collect(Collectors.toList());
    }

    List<Apple> getApplesByWeight(int weight) {
        return getAllApples().stream()
                .filter(apple -> weight == (apple.getWeight()))
                .collect(Collectors.toList());
    }
    public List<Apple> findApples(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for(Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
