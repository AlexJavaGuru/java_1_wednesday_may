package lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_7;

class WordServiceTest {

    public static void main(String[] args) {
        testFindMostFrequentWord();
        testFindNotMostFrequentWord();
    }

    private static void testFindMostFrequentWord() {
        String text = "testik na nahozhdenie maksimaljnogo kol-va slova testik";
        WordService subject = new WordService();
        check(subject.findMostFrequentWord(text).equals("testik"), "Test Find Most Frequent Word");
    }

    private static void testFindNotMostFrequentWord() {
        String text = "testik na nahozhdenie maksimaljnogo kol-va slova testik";
        WordService subject = new WordService();

        check(!subject.findMostFrequentWord(text).equals("maksimaljnogo"), "Test Find Not Most Frequent Word");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
