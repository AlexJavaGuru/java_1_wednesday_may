package lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.predicate;

import lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.Apple;
@FunctionalInterface
public interface ApplePredicate {

    boolean test (Apple apple);
}
