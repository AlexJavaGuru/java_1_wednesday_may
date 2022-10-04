package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_7;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray = text.split(" ");
        int[] wordCountArray = new int[textArray.length];
        return textArray[mostFrequentPosition(wordCountArray)];
    }

    int[] countArray(String[] textArray) {
        int wordCounter = 0;
        int[] wordCountArray = new int[textArray.length];
        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            for (String s : textArray) {
                if (textArray[wordCount].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[wordCount] = wordCounter;
            wordCounter = 0;
        }
        return wordCountArray;
    }

    int mostFrequentPosition(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }
}
