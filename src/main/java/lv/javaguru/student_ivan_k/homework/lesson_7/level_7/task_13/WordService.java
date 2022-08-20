package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_7.task_13;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] textArray =  text.split(" ");
        int[] wordCountArray= new int[textArray.length];

        int wordCounter = 0;
        for (int i = 0; i < textArray.length; i++) {
            for (String s : textArray) {
                if (textArray[i].equals(s)) {
                    wordCounter++;
                }
            }
            wordCountArray[i] = wordCounter;
            wordCounter = 0;
        }

        int max = 0;
        for (int j =0; j < wordCountArray.length; j++) {
            if (wordCountArray[j] > max) {
                max = j;
            }
        }
        return textArray[max];
    }

}
