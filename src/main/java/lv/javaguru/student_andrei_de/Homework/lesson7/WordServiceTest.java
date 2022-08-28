package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

import java.util.Objects;

class WordServiceTest {

    public static void main(String[] args) {
       findMostFrequentWordTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Fail");
        }
    }

    static WordService wordService = new WordService();

    static void findMostFrequentWordTest() {
        String text = "Hello everyone everyone so this is how I can find frequent word";
        String result = wordService.findMostFrequentWord(text);
        String expResult = "everyone";
        check(Objects.equals(result, expResult), "Find Most Frequent Word Test");


    }
}