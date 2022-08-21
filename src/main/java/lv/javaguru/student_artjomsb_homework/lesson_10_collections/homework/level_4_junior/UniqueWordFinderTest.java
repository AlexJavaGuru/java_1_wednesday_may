package main.java.lv.javaguru.student_artjomsb_homework.lesson_10_collections.homework.level_4_junior;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class UniqueWordFinderTest {
    public static void main(String[] args) {
        UniqueWordFinderTest runner = new UniqueWordFinderTest();
        runner.testFind();
    }

    private void testFind() {
        UniqueWordFinder uniqueWordFinder = new UniqueWordFinder();
        String text = "This was simple word finder , which searches for word by space , was for by simple";
        Set<String> expectedResult = new HashSet<>(Arrays.asList("This", "was", "simple", "word", "finder", ",", "which", "searches", "for", "by", "space"));
        Set<String> actualResult = uniqueWordFinder.find(text);
        check(expectedResult.equals(actualResult), "Test find unique words");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
