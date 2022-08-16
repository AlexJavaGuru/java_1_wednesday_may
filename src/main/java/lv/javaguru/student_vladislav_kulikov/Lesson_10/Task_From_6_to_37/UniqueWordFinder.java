package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_37;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueWordFinder {

    private List<String> stringList;

    public UniqueWordFinder(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<String> find(String text) {
        Set<String> result = new HashSet<>();
        for (String string : stringList) {
            if (string.contains(text)) {
                result.add(string);
            }
        }
        return result;
    }
}
