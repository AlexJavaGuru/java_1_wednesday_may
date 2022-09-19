package lv.javaguru.teacher.lesson_14_streamapi.lessoncode;

import lv.javaguru.teacher.lesson_14_streamapi.lessoncode.searchcriteria.TomatoRedSearchCriteria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FruitStoreTest {

    FruitStore fruitStore;

    @BeforeEach
    void setUp() {
        fruitStore = new FruitStore();
    }

    @Test
    void findFruitsByCriteria() {
        TomatoRedSearchCriteria tomatoRedSearchCriteria = new TomatoRedSearchCriteria();
        List<Fruit> result = fruitStore.findFruitsByCriteria(tomatoRedSearchCriteria);
        assertThat(result.size()).isEqualTo(1);
    }
}