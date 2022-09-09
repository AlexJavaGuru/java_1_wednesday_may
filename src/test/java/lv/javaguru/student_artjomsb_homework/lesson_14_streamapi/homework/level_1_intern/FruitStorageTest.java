package lv.javaguru.student_artjomsb_homework.lesson_14_streamapi.homework.level_1_intern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FruitStorageTest {
    private FruitStorage fruitStorage;
    private List<Apple> expected;

    @BeforeEach
    void setUp() {
        fruitStorage = new FruitStorage();
        expected = new ArrayList<>();
    }

    @Test
    void getApplesByColorGreen() {
        expected.add(new Apple("green", 200));
        expected.add(new Apple("green", 90));
        expected.add(new Apple("green", 50));
        List<Apple> actual = fruitStorage.getApplesByColor("GrEeN");
        assertEquals(expected, actual);
    }
    @Test
    void getApplesByColorYellow() {
        expected.add(new Apple("yellow", 50));
        expected.add(new Apple("yellow", 170));
        List<Apple> actual = fruitStorage.getApplesByColor("yEllow");
        assertEquals(expected, actual);
    }
    @Test
    void getApplesByColor() {
        List<Apple> actual = fruitStorage.getApplesByColor("Brown");
        assertEquals(expected, actual);
    }
    @Test
    void getApplesByWeight() {
        expected.add(new Apple("red", 200));
        expected.add(new Apple("green", 200));
        List<Apple> actual = fruitStorage.getApplesByWeight(200);
        assertEquals(expected, actual);
    }
    @Test
    void getApplesByWeightEmpty() {
        List<Apple> actual = fruitStorage.getApplesByWeight(201);
        assertEquals(expected, actual);
    }
}