package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_1_intern;

import java.util.Arrays;

class WordService {

     String findMostFrequentWord(String text) {
        String[] textInArray = stringToArray(text);
        sortArray(textInArray);
        String wordToCheck= "";
        int counter = 1;
        int maxCounts = 0;
        String mostFrequentWord = textInArray[0];
        for (String word : textInArray
        ) {
            if (word.equals(wordToCheck)) {
                counter++;
            } else {
                if (counter > maxCounts) {
                    maxCounts = counter;
                    mostFrequentWord = wordToCheck;
                }
                counter = 1;
                wordToCheck= word;
            }
        }
        return mostFrequentWord;
    }

    static String[] stringToArray(String text) {
        return text.split(" ");
    }

    static void sortArray(String[] array) {
        Arrays.sort(array);
    }
}
