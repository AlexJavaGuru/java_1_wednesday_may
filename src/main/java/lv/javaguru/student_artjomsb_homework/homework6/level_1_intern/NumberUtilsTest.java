package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_1_intern;

class NumberUtilsTest {
    public static void main(String[] args) {
        testIsEven();
        testIsOdd();
    }

   private static void testIsEven() {
        NumberUtils tester = new NumberUtils();
        check(tester.isEven(232), "Test even number");
    }

    private static void testIsOdd() {
        NumberUtils tester = new NumberUtils();
        check(!tester.isEven(237), "Test odd number");
    }

   private static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test " + testName + ", Passed");
        } else {
            System.out.println("Test " + testName + ", Failed");
        }
    }
}
