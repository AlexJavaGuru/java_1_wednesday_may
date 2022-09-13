package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.Tests;

import main.java.lv.javaguru.student_vladislav_kulikov.Lesson_10.Task_From_6_to_38.UniqueWordFinder;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class UniqueWordFinderTest {

    public static void main(String[] args) {
        testFind();
    }

    static void testFind() {
        List<String > stringList = new ArrayList<>();
        stringList.add("Example");
        stringList.add("Example1");
        stringList.add("Example2");
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder(stringList);
        Set<String> result = uniqueWordFinder.find("Example");
        check(result.contains("Example") && result.contains("Example1") && result.contains("Example2"), "Test Find");
    }

    private static void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }

}
