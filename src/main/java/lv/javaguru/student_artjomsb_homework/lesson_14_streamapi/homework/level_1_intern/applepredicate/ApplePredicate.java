package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern.applepredicate;

import lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern.Apple;

@FunctionalInterface
public interface ApplePredicate {
    boolean test(Apple apple);
}
