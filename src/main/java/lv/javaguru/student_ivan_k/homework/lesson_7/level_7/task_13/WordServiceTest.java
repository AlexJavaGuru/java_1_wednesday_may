package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_7.task_13;

public class WordServiceTest {

    public static void main(String[] args) {
        testIsFindMostFrequentWord();


    }

    static void testIsFindMostFrequentWord(){
        WordService wordService = new WordService();
        String testText = "many people and so few people";
        String expectedResult = "people";
        String actualResult = wordService.findMostFrequentWord(testText);
        check(actualResult.equals(expectedResult),"Find most frequid word");


    }

    static void check(boolean result,String testName){
        if(result){
            System.out.println(testName + " has passed!OK.");
        }else {
            System.out.println(testName + " has failed!!!!!!!");
        }
    }
}
