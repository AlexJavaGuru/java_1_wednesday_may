package lv.javaguru.student_rodions_pismennijs.lesson_10.level_4;

import java.util.HashSet;
import java.util.Set;

class UniqueWordFinder {

    Set<String> find(String text) {
        Set<String> uniqueWords = new HashSet<>();
        String[] words = text.toLowerCase().split("[-.,:;?!~\\s]+");
        for (String word : words) {
            uniqueWords.add(word);
        }
        return uniqueWords;
    }
}
