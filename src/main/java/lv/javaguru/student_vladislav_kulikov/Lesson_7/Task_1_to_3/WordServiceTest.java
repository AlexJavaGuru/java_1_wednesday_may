package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_7.Task_1_to_3;

class WordServiceTest {

    public static void main(String[] args) {
        findMostWordTest();
        fromStringToArrayString();
        findWordInArrayTest();
    }

    static void findMostWordTest() {
        WordService subject = new WordService();
        String actualResult = subject.findMostWord("hello hello hi");
        check(actualResult.equals("hello"), "Find Most Word Test");
    }

    static void fromStringToArrayString() {
        WordService subject = new WordService();
        String[] expectedResult = {"hi"};
        String[] actualResult = subject.fromStringToArrayString("hi");
        for (int i = 0; i < expectedResult.length; i++) {
            if (expectedResult[i].equals(actualResult[i])) {
                System.out.println("From String To Array String = OK");
            } else {
                System.out.println("From String To Array String = FAILED");
            }
        }
    }

    static void findWordInArrayTest() {
        WordService subject = new WordService();
        String actualResult = subject.findMostWord("hello hello hi");
        check(actualResult.equals("hello"), "Find Word In Array");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + "= FAILED");
        }
    }
}
