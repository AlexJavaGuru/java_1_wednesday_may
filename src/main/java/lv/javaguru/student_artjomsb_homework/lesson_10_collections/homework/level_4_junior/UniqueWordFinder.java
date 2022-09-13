package lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_4_junior;

import java.util.*;

public class UniqueWordFinder {
    Set<String> find(String text) {
        List<String> words = new ArrayList<>(Arrays.asList(text.split("\s")));
        Set<String> uniqueWords = new HashSet<>(words);
        return uniqueWords;
    }
}
