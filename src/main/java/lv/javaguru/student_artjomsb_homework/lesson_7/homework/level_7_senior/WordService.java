package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_7_senior;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray;
        textArray = text.split(" ");
        int[] wordCountArray = createMassiveWhichReplaceWordsWithItAmount(textArray);
        return textArray[findPositionOfBiggestNumber(wordCountArray)];
    }

    int[] createMassiveWhichReplaceWordsWithItAmount(String[] textArray) {
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

    int findPositionOfBiggestNumber(int[] wordCountArray) {
        int max = 0;
        for (int count = 0; count < wordCountArray.length; count++) {
            if (wordCountArray[count] > max) {
                max = count;
            }
        }
        return max;
    }

}