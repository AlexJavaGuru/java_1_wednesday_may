package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_1.task_1;

class WordService {


    public String findMostFrequentWord(String text) {
        String[] words = replaceAndsplittingUp(text);
        int[] occurrences = numOfRepit(words);
        int wordPosition = searchMaxNum(occurrences);

        return  words[wordPosition];

    }


    public String[] replaceAndsplittingUp(String text) {
        String wordsReplace = text.replaceAll("[^\\w\\s]", "");
        String[] arrayWords = wordsReplace.split("\\s");
        return arrayWords;

    }

    private int[] numOfRepit(String[] arrayString) {
        int k = 0;
        int [] arrayNumberOfrepit = new int [arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            for (int j = i+1; j < arrayString.length; j++) {
                if (arrayString[i].equals(arrayString[j])) {
                    k++;
                    arrayNumberOfrepit[i] = k;
                }
            }

            k = 0;

        }

        return arrayNumberOfrepit;
    }

    private int searchMaxNum (int[] arrayNumberOfrepeat) {
        int max = arrayNumberOfrepeat[0];
        for (int search : arrayNumberOfrepeat)
            if (search > max) {
                max = search;
            }
        return max;
    }



}