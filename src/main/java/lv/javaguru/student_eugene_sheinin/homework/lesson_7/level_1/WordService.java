package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_1;

public class WordService {

    public String findMostFrequentWord(String text) {

        String mostFrequentWorld = "";
        int maxWordOccurrences = 0;

        for(WordEntry wordEntry: this.getWordEntries(text.split(" "))) {
            if(wordEntry.getOccurrences() > maxWordOccurrences) {
                maxWordOccurrences =  wordEntry.getOccurrences();
                mostFrequentWorld = wordEntry.getWord();
            }
        }

        return mostFrequentWorld;
    }

    private WordEntry[] getWordEntries(String[] words) {
        WordEntry[] wordEntries = new WordEntry[words.length];
        for (int i = 0;  i < words.length; i++) {
            WordEntry wordEntry = new WordEntry(words[i]);
            wordEntry.setOccurrences(
                    this.calculateWordOccurrences(words[i], words)
            );
            wordEntries[i] = wordEntry;
        }

        return  wordEntries;
    }

    private int calculateWordOccurrences(String word, String[] words) {
        int occurrences = 0;
        for (int i = 0; i < words.length; i++) {
            if(words[i].equals(word)) {
                occurrences++;
            }
        }

        return occurrences;
    }
}
