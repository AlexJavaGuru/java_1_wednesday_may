package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_1.task_1;

import java.util.Arrays;

public class WordServiceDemo {

    public static void main(String[] args) {
        WordService wordService = new WordService();
        String text = "All people like people, but I is King!";

        String word = wordService.findMostFrequentWord(text);
        System.out.println(word);

    }
}
