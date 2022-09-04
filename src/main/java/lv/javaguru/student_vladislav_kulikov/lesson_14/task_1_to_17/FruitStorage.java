package lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17;

import lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.predicate.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

public class FruitStorage {

    private List<Apple> inventory;

    public FruitStorage(List<Apple> inventory) {
        this.inventory = inventory;
    }

    public List<Apple> getApplesByColor(List<Apple> appleList, String color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> getApplesByWeight(List<Apple> appleList, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    public List<Apple> filterApples(List<Apple> appleList, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : appleList) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }
}
