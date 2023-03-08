package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern.applepredicate;

import lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern.Apple;

public class RedApplePredicate implements ApplePredicate {
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}