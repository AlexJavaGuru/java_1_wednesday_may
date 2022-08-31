package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_1.task_1;

import java.util.Arrays;

public class WordServiceTest {

    public static void main(String[] args) {
        WordServiceTest runner = new WordServiceTest();
        runner.isreplaceAndsplitting();
        runner.isFindMostFrequentWord();

    }

    public void isreplaceAndsplitting() {
        WordService wordService = new WordService();
        String testString = "Hello, my friends!";
        String[] expectedResult = new String[3];
        expectedResult[0] = "Hello";
        expectedResult[1] = "my";
        expectedResult[2] = "friends";
        String[] actualResult = wordService.replaceAndsplittingUp(testString);
        check(Arrays.deepEquals(actualResult, expectedResult), "Replace and splitting");
    }

    public void isFindMostFrequentWord(){
        WordService wordService = new WordService();
        String testText = "All people like people, but I is King!";
        String expectedResult = "people";
        String actualResult = wordService.findMostFrequentWord(testText);
        check(actualResult.equals(expectedResult),"Find most frequent word");

    }

    public void check(Boolean result, String testName) {
        if (result) {
            System.out.println(testName + " has been PASSED! OK!");
        } else {
            System.out.println(testName + " has been FAILED!!!!!! ");
        }
    }


}


