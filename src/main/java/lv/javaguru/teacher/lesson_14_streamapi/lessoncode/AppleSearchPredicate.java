package lv.javaguru.teacher.lesson_14_streamapi.lessoncode;

import java.util.function.Predicate;

public class AppleSearchPredicate implements Predicate<Fruit> {

    @Override
    public boolean test(Fruit fruit) {
        return fruit.getTitle().equals("apple");
    }

}
