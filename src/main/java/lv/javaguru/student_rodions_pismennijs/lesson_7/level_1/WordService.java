package lv.javaguru.student_rodions_pismennijs.lesson_7.level_1;

class WordService {

    public String findMostFrequentWord(String text) {
        String[] words = text.split(" ");
        int max = 0;
        int count = 1;
        String word = words[0];
        String curr = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].equals(curr)) {
                count++;
            } else {
                count = 1;
                curr = words[i];
            }
            if (max < count) {
                max = count;
                word = words[i];
            }
        }
        return word;
    }
}
