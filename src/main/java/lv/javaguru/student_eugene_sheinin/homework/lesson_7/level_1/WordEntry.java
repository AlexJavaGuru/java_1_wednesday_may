package lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_1;

public class WordEntry {
    private final String word;
    private int occurrences = 1;

    public WordEntry(String word) {
        this.word = word;
    }

    public int getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(int occurrences) {
        this.occurrences = occurrences;
    }

    public String getWord() {
        return word;
    }
}
