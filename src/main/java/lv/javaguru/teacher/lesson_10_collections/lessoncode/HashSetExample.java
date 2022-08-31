package lv.javaguru.teacher.lesson_10_collections.lessoncode;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void main(String[] args) {

        Set<String> someSet = new HashSet<>();
        someSet.add("A");
        someSet.add("B");
        someSet.add("C");
        someSet.add("D");
        someSet.add("E");
        someSet.add("F");
        someSet.add("G");
        someSet.add("H");
        someSet.add("IIII");
        someSet.add("J");
        someSet.add("K");
        someSet.add("M");
        someSet.add("N");
        someSet.add("O");
        someSet.add("P");
        someSet.add("Q");
        someSet.add(null);


        System.out.println(someSet);

        for (String letter : someSet) {
            System.out.println(letter);
        }

        someSet.add("R");
        someSet.add("X");
        someSet.add("Y");
        someSet.add("Z");

        for (String letter : someSet) {
            System.out.println(letter);
        }
    }
}
