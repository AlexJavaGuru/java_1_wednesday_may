package lv.javaguru.teacher.lesson_14_streamapi.lessoncode;

import java.util.ArrayList;
import java.util.List;

public class FruitStore {

    private List<Fruit> fruits = new ArrayList<>();

    public FruitStore() {
        fruits.add(new Fruit("apple", "red", 100));
        fruits.add(new Fruit("apple", "green", 200));
        fruits.add(new Fruit("pear", "red", 100));
        fruits.add(new Fruit("pear", "yellow", 100));
        fruits.add(new Fruit("tomato", "red", 100));
    }

    public List<Fruit> getAllFruits() {
        return fruits;
    }


    // Требование 1: отобрать все яблоки
    public List<Fruit> getAllApples() {
        return getFruitsByTitle("apple");
    }

    // Требование 2: отобрать все груши
    public List<Fruit> getAllPears() {
        return getFruitsByTitle("pear");
    }

    // Требование 3: отобрать все помидоры
    public List<Fruit> getAllTomatos() {
        return getFruitsByTitle("tomato");
    }

    public List<Fruit> getAllRedFruits() {
        return findAllFruitsByColor("red");
    }

    private List<Fruit> getFruitsByTitle(String title) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getTitle().equals(title)) {
                result.add(fruit);
            }
        }
        return result;
    }

    // Требование 4: красные фрукты
    public List<Fruit> findAllFruitsByColor(String fruitColor) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor)) {
                result.add(fruit);
            }
        }
        return result;
    }


    // Требование 5: красные помидоры
    public List<Fruit> findFruitsByTitleAndColor(String fruitTitle,
                                                 String fruitColor) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor) &&
                    fruit.getTitle().equals(fruitTitle)) {
                result.add(fruit);
            }
        }
        return result;
    }


    // Требование 6: красные помидоры > 100
    public List<Fruit> findFruitsByTitleAndColorAndWeight(String fruitTitle,
                                                          String fruitColor,
                                                          int weight) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (fruit.getColor().equals(fruitColor) &&
                    fruit.getTitle().equals(fruitTitle) &&
                    fruit.getWeight() == weight) {
                result.add(fruit);
            }
        }
        return result;
    }


    public List<Fruit> findFruitsByCriteria(FruitSearchCriteria searchCriteria) {
        List<Fruit> result = new ArrayList<>();
        for (Fruit fruit : fruits) {
            if (searchCriteria.test(fruit)) {
                result.add(fruit);
            }
        }
        return result;
    }


}
