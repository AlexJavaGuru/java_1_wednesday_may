package main.java.lv.javaguru.teacher.lesson_4_if_statement.lessoncode.basicteatapproach;

public class QuickMathsTest {

    public static void main(String[] args) {
        QuickMathsTest testRunner = new QuickMathsTest();
        testRunner.testQuickMathIsWorking();
    }

    public void testQuickMathIsWorking() {
        QuickMaths subject = new QuickMaths();
        int varA = 10;
        int varB = 20;
        int expectedResult = 20;
        int actualResult = subject.max(varA, varB);
        if (expectedResult == actualResult) {
            System.out.println("Test1 has passed.");
        } else {
            System.out.println("Test1 has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
