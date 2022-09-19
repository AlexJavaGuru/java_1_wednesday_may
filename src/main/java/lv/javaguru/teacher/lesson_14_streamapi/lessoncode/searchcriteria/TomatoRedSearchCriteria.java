package lv.javaguru.teacher.lesson_14_streamapi.lessoncode.searchcriteria;

import lv.javaguru.teacher.lesson_14_streamapi.lessoncode.Fruit;
import lv.javaguru.teacher.lesson_14_streamapi.lessoncode.FruitSearchCriteria;

public class TomatoRedSearchCriteria implements FruitSearchCriteria {

    @Override
    public boolean test(Fruit fruit) {
        return fruit.getTitle().equals("tomato") && fruit.getColor().equals("red");
    }

}
