package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_13;

class WordService {
    String findMostFrequentWord(String text) {
        String[] textArray = fromStringToArray(text);
        int[] wordCountArray = counterWord(textArray);

        return findWord(wordCountArray, textArray);
    }

    String[] fromStringToArray(String text) {
        String[] textArray;
        textArray = text.split(" ");

        return textArray;
    }

    int[] counterWord(String[] textArray) {
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

    String findWord(int[] wordCountArray, String[] textArray) {
        int index = 0;

        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > index) {
                index = count;
            }
        }
        return textArray[index];
    }
}