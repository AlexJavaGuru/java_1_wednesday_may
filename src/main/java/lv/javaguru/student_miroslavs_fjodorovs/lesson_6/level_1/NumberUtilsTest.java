package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_1;

class NumberUtilsTest {

    NumberUtils numberUtils = new NumberUtils();

    public static void main(String[] args) {
        NumberUtilsTest numberUtilsTest = new NumberUtilsTest();
        numberUtilsTest.NumberIsEven();
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " has been passed");
        } else {
            System.out.println(testName + " has been failed");
        }
    }

    public void NumberIsEven() {
        check(numberUtils.isEven(8), "Even Number Test");
    }
}
