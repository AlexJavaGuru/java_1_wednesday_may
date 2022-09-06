package lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.predicate;

import lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.Apple;

public class AppleGreenColorPredicate implements ApplePredicate {


    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("green");
    }

}
