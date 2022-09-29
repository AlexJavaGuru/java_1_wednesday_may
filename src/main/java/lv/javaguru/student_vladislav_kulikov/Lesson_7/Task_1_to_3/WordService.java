package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_1_to_3;

class WordService {

    String findMostWord(String text) {
        String word = findWordInArray(text);
        return word;
    }

    String[] fromStringToArrayString(String text) {
        String[] word = text.split(" ");
        return word;
    }

     String findWordInArray(String text) {
        String[] word = fromStringToArrayString(text);
        int[] count = new int[word.length];
        int maxCount = 0;
        int index = 0;
        for (int i = 0; i < word.length; i++) {
            for (int j = 0; j < word.length; j++) {
                if (word[i].equals(word[j])) {
                    count[i]++;
                }
            }
        }
         for (int i = 0; i < count.length; i++) {
             if (count[i] > maxCount) {
                 maxCount = count[i];
                 index = i;
             }
         }
         return word[index];
    }
}

