package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_1;

public class NumberUtilsTest {
    NumberUtils numberUtils = new NumberUtils();

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.isEvenTest();
        numberUtilsTest.isNotEvenTest();
    }

    void isEvenTest() {
        this.check(this.numberUtils.isEven(6), "is Number Even Test");
    }

    void isNotEvenTest() {
        this.check(!this.numberUtils.isEven(5), "is Number Even Test");
    }

    private void check(boolean expectedResult, String testName) {
        if (expectedResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
        }
    }
}
