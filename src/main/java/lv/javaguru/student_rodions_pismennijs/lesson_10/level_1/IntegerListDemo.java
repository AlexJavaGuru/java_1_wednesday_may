package lv.javaguru.student_rodions_pismennijs.lesson_10.level_1;

import java.util.*;

class IntegerListDemo {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(4);
        array.add(3);
        array.add(2);
        array.add(1);
        System.out.println(array.size());
        System.out.println(array);
        array.remove(0);
        System.out.println(array);
        System.out.println(array.isEmpty());
        for (Integer integer : array) {
            System.out.println(integer);
        }

        List<Integer> linked = new LinkedList<>();
        linked.add(5);
        linked.add(5);
        System.out.println(linked);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "one");
        map.put(3, "three");
        map.put(3, "four");
        System.out.println(map.get(3));

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(1);
        System.out.println(set);
    }
}
