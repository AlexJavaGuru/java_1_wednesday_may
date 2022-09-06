package lv.javaguru.student_vladislav_kulikov.lesson_14;

import lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.Apple;
import lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.FruitStorage;
import lv.javaguru.student_vladislav_kulikov.lesson_14.task_1_to_17.predicate.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitStorageTest {

    FruitStorage fruitStorage;
    List<Apple> inventory = new ArrayList<>();

    @BeforeEach
    void add() {
        inventory.add(new Apple("red", 100));
        inventory.add(new Apple("red", 160));
        inventory.add(new Apple("red", 200));
        inventory.add(new Apple("green", 200));
        inventory.add(new Apple("green", 90));
        inventory.add(new Apple("green", 50));
        inventory.add(new Apple("yellow", 50));
        inventory.add(new Apple("yellow", 170));
        fruitStorage = new FruitStorage(inventory);
    }

    @Test
    void testGetAllGreenApples() {
        List<Apple> expectedResult = new ArrayList<>();

        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        assertEquals(expectedResult, fruitStorage.getApplesByColor(inventory, "red"));
    }

    @Test
    void testFilterApplesByWeight() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        assertEquals(expectedResult, fruitStorage.getApplesByWeight(inventory, 190));
    }

    @Test
    void testFindApplesByGreenPredicate() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new AppleGreenColorPredicate()));
    }

    @Test
    void testFindApplesByRedPredicate() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new AppleRedColorPredicate()));
    }

    @Test
    void testFindApplesByHeavyWeightPredicate() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new HeavyApplesPredicate()));
    }

    @Test
    void testFindGreenApplesByColorAndWeight() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new AppleGreenColorHeavyPredicate()));
    }

    @Test
    void testFindApplesByGreenPredicateAnonim() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green");
            }
        }));
    }

    @Test
    void testFindApplesByRedPredicateAnonim() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("red");
            }
        }));
    }

    @Test
    void testFindApplesByHeavyWeightPredicateAnonim() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 150;
            }
        }));
    }

    @Test
    void testFindGreenApplesByColorAndWeightAnonim() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor().equals("green") && apple.getWeight() > 150;
            }
        }));
    }



    @Test
    void testFindApplesByGreenPredicateLambda() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("green", 90));
        expectedResult.add(new Apple("green", 50));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory,
                (Apple apple) -> "green".equals(apple.getColor())));
    }

    @Test
    void testFindApplesByRedPredicateLambda() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 100));
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory,
                (Apple apple) -> "red".equals(apple.getColor())));
    }

    @Test
    void testFindApplesByHeavyWeightPredicateLambda() {
        List<Apple> expectedResult = new ArrayList<>();
        expectedResult.add(new Apple("red", 160));
        expectedResult.add(new Apple("red", 200));
        expectedResult.add(new Apple("green", 200));
        expectedResult.add(new Apple("yellow", 170));
        assertEquals(expectedResult, fruitStorage.filterApples(inventory,
                (Apple apple) -> apple.getWeight() > 150));
    }
}