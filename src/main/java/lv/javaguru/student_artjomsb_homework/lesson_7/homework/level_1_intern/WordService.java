package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_1_intern;

import java.util.Arrays;

class WordService {

    String textToArrayThenSortAndFindMostFrequent(String text) {
        String[] textInArray = stringToArray(text);
        sortArray(textInArray);
        return findMostFrequentWordInArray(textInArray);
    }

    String findMostFrequentWordInArray(String[] array) {
        String wordToCheck = "";
        int counter = 1;
        int maxCounts = 0;
        String mostFrequentWord = array[0];
        for (String word : array
        ) {
            if (word.equals(wordToCheck)) {
                counter++;
            } else {
                if (counter > maxCounts) {
                    maxCounts = counter;
                    mostFrequentWord = wordToCheck;
                }
                counter = 1;
                wordToCheck = word;
            }
        }
        return mostFrequentWord;
    }

    String[] stringToArray(String text) {
        return text.split(" ");
    }

    void sortArray(String[] array) {
        Arrays.sort(array);
    }
}
