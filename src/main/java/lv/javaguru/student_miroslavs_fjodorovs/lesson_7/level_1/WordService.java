package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        int counter = 1;
        int max = 0;
        String word = words[0];
        String current = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(current)) {
                counter++;
            } else {
                counter = 1;
                current = words[i];
            }
            if (max < counter) {
                max = counter;
                word = words[i];
            }
        }
        return word;
    }
}
