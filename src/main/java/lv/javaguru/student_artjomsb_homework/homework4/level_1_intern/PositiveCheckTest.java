package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;


class PositiveCheckTest {
    public static void main(String[] args) {
        PositiveCheckTest runner = new PositiveCheckTest();
        runner.checkIsPositive();
        runner.checkIsNegative();
        runner.checkIsZero(0);
    }

    private void checkIsZero(int number) {
        PositiveCheck victim = new PositiveCheck();
        String expectedResult = "Number = 0";
        check(expectedResult, victim.positiveCheck(number), "Test check if zero");
    }

    private void checkIsNegative() {
        PositiveCheck victim = new PositiveCheck();
        int number = (int) Math.floor(Math.random() * 100) - 101;
        String expectedResult = "Negative";
        check(expectedResult, victim.positiveCheck(number), "Test check if negative");
    }

    private void checkIsPositive() {
        PositiveCheck victim = new PositiveCheck();
        int number = (int) Math.floor(Math.random() * 100) + 1;
        String expectedResult = "Positive";
        check(expectedResult, victim.positiveCheck(number), "Test check if positive");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        boolean isPassed = expectedResult.equals(actualResult);
        if (isPassed) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
