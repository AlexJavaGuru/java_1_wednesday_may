package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_1_2_3;

class NumberCheckerTest {

    public static void main(String[] args) {

        NumberCheckerTest numberCheckerTest = new NumberCheckerTest();
        numberCheckerTest.testPositiveOrNegative();
        numberCheckerTest.testWhatIsDayOfTheWeek();
        numberCheckerTest.testOddOrEven();
        numberCheckerTest.testGetMaxNumber();
        numberCheckerTest.testGetMinNumber();
        numberCheckerTest.testAreEqualNumbers();
        numberCheckerTest.testAreNotEqualNumbers();
    }

    public void testPositiveOrNegative() {
        NumberChecker numberChecker = new NumberChecker();
        int number = -5;
        String expectedResult = "negative";
        String actualResult = numberChecker.positiveOrNegative(number);
        this.check(expectedResult, actualResult,"Test Number is Positive or Negative");
    }

    public void testWhatIsDayOfTheWeek() {
        NumberChecker numberChecker = new NumberChecker();
        int dayNumber = 7;
        String expectedResult = "Sunday";
        String actualResult = numberChecker.whatIsDayOfTheWeek(dayNumber);
        this.check(expectedResult, actualResult,"Test what Is Day Of The Week");
    }

    public void testOddOrEven() {

        NumberChecker numberChecker = new NumberChecker();
        int number = 4;
        String expectedResult = "Even";
        String actualResult = numberChecker.oddOrEven(number);
        this.check(expectedResult, actualResult,"Test Odd Or Even");
    }

    public void testGetMaxNumber() {
        NumberChecker numberChecker = new NumberChecker();
        int number1  = 2;
        int number2  = 9;
        int expectedResult = 9;
        int actualResult = numberChecker.getMaxNumber(number1, number2);
        this.check(expectedResult, actualResult,"Test Get Max Number");
    }

    public void testGetMinNumber() {
        NumberChecker numberChecker = new NumberChecker();
        int number1  = 2;
        int number2  = 9;
        int expectedResult = 2;
        int actualResult = numberChecker.getMinNumber(number1, number2);
        this.check(expectedResult, actualResult,"Test Get Max Number");
    }

    public void testAreEqualNumbers() {
        NumberChecker numberChecker = new NumberChecker();
        int number1  = 9;
        int number2  = 9;
        boolean expectedResult = true;
        boolean actualResult = numberChecker.areEqualNumbers(number1, number2);
        this.check(actualResult,"test Are Equal Numbers");
    }

    public void testAreNotEqualNumbers() {
        NumberChecker numberChecker = new NumberChecker();
        int number1  = 9;
        int number2  = 3;
        boolean expectedResult = true;
        boolean actualResult = numberChecker.areEqualNumbers(number1, number2);
        this.check(!actualResult,"test Are Not Equal Numbers");
    }



    public void check(String expectedResult, String actualResult, String testName) {
        if (actualResult.equals(expectedResult)) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
    public void check(int expectedResult, int actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }

    public void check(boolean expectedResult, String testName) {
        if (expectedResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: true" + expectedResult + " but actual is: " + !expectedResult);
        }
    }
}
