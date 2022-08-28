package lv.javaguru.teacher.lesson_10_collections.lessoncode;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class HashMapExample {

    public static void main(String[] args) {
        User alex = new User("Alex", "Ivanov", 876543);
        User alex2 = new User("Alex", "Ivanov", 876543);
        int alexHashCode1 = alex.hashCode();
        int alexHashCode2 = alex.hashCode();
        int alexHashCode3 = alex.hashCode();
        int alexHashCode4 = alex.hashCode();
        System.out.println("Alex 1 - " + alexHashCode1);
        System.out.println("Alex 1 - " + alexHashCode2);
        System.out.println("Alex 1 - " + alexHashCode3);
        System.out.println("Alex 1 - " + alexHashCode4);

        System.out.println("Alex 2 - " + alex2.hashCode());


        Map<Integer, String> testMap = new HashMap<>();
        testMap.put(1, "A");
        testMap.put(2, "B");
        testMap.put(3, "C");
        System.out.println(testMap);

        Map<User, List<User>> managers = new HashMap<>();
        User managerOleg = new User("Oleg", "Some", 122343);
        User managerMax = new User("Max", "Some", 122343);
        List<User> developers = List.of(new User("Dima", "ABC", 7652135),
                new User("Andrej", "CBA", 1241262));
        managers.put(managerOleg, developers);

        System.out.println(managerOleg.hashCode());

        //key.hashCode() & (n - 1), где n - кол-во бакетов
        //1111111111111111111111111111111110010001101110000011101101010001
        //0000000000000000000000000000000000000000000000000000000000001111 - bucket count
        //0000000000000000000000000000000000000000000000000000000000000001 - bucket index 1

        System.out.println(managerMax.hashCode());

        //1001001100101111011111110110
        //0000000000000000000000001111
        //0000000000000000000000000110 - index 6


        //en, de, fr, it
        //ENG, DEN, FRA, ITA
        Map<String, String> languages = new HashMap<>();
        languages.put("en", "ENG");
        languages.put("de", "DEN");
        languages.put("fr", "FRA");
        languages.put("it", "ITA");

        String result = languages.get("de");
        System.out.println(result);

        Set<User> users = managers.keySet();
        List<List<User>> values = new ArrayList<>(managers.values());
        Set<Map.Entry<User, List<User>>> entries = managers.entrySet();
        for (Map.Entry<User, List<User>> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
