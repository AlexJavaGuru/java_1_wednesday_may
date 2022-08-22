package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_10.level_2_3_4_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UniqueWordFinderTest {
    public static void main(String[] args) {
        findTest();
    }

    private static void findTest() {
        Set<String> expectedSet =  new HashSet<String>(
                Arrays.asList(
                        ("string with unique worlds").split(" ")
                )
        );
        Set<String> actualSet = new UniqueWordFinder().find("string with unique unique worlds");
        check(
                actualSet.equals(expectedSet)
                ,"findTest"
        );
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }

}
