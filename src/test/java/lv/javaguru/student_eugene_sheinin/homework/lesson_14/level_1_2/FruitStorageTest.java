package lv.javaguru.student_eugene_sheinin.homework.lesson_14.level_1_2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {
    FruitStorage subject;
    List<Apple> allApples;

    @BeforeEach
    void setUp() {
        subject = new FruitStorage();
        allApples = subject.getAllApples();
    }

    @Test
    void testGetGreenApples() {
        assertEquals(3 ,subject.getGreenApple().size());
    }

    @Test
    void filterApplesByColor() {
        assertEquals(
                3 ,
                subject.findApplesByColor(subject.getAllApples(), "green")
                .size()
        );
    }

    @Test
    void findApplesWithPredicate() {
        assertEquals(3, subject.findApples(allApples, new GreenApplePredicate()).size());
        assertEquals(3, subject.findApples(allApples, new RedApplePredicate()).size());
        assertEquals(4, subject.findApples(allApples, new LightWeightApplePredicate()).size());
        assertEquals(4, subject.findApples(allApples, new HeavyWeightApplePredicate()).size());
        assertEquals(3,subject.findApples(allApples, new ApplePredicate() {
            public boolean test(Apple apple) {
                return "red".equals(apple.getColor());
            }
        }).size());
    }

    @Test
    void findApplesWithLambda() {
        assertEquals(3,subject.findApples(allApples, (Apple apple) -> "red".equals(apple.getColor())).size());
        assertEquals(3,subject.findApples(allApples, (Apple apple) -> "green".equals(apple.getColor())).size());
        assertEquals(4,subject.findApples(allApples, (Apple apple) -> apple.getWeight() > 150).size());
        assertEquals(4,subject.findApples(allApples, (Apple apple) -> apple.getWeight() < 150).size());
    }



}