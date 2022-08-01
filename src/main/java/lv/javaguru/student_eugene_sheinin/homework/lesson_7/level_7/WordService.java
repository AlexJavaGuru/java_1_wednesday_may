package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_7;

class WordService {

    public String findMostFrequentWord(String text) {

        int[] wordCounts = calculateWorldCountInArray(text.split(" "));
        int max = 0;
        for (int count =0; count < wordCounts.length; count++) {
            if (wordCounts[count] > max) {
                max = count;
            }
        }

        return text.split(" ")[max];
    }

    private int[] calculateWorldCountInArray(String[] textArray) {
        int[] wordCountArray;
        wordCountArray = new int[textArray.length];

        for (int wordCount = 0; wordCount < textArray.length; wordCount++) {
            int wordCounter = getWordCounter(textArray, wordCount);
            wordCountArray[wordCount] = wordCounter;
        }
        return wordCountArray;
    }

    private int getWordCounter(String[] textArray, int wordCount) {
        int wordCounter = 0;
        for (String s : textArray) {
            if (textArray[wordCount].equals(s)) {
                wordCounter++;
            }
        }

        return wordCounter;
    }
}
