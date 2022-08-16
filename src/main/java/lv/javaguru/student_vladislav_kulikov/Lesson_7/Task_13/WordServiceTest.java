package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_7.Task_13;

class WordServiceTest {

    public static void main(String[] args) {
        findMostFrequentWord();
        noWords();
    }

    static void findMostFrequentWord(){
        WordService subject = new WordService();
        String words = "Hello Hi Hi Hi Hello";
        String result = subject.findMostFrequentWord(words);
        check(result.equals("Hi"), "Find Most Frequent Word");
    }

    static void noWords() {
        WordService subject = new WordService();
        String words = "";
        String result = subject.findMostFrequentWord(words);
        check(result.equals(""), "No words");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}