package lv.javaguru.student_eugene_sheinin.homework.lesson_14.level_1_2;

public class RedApplePredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals("red");
    }
}
