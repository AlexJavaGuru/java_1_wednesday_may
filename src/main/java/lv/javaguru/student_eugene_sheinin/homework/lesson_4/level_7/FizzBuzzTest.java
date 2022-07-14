package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_7;


class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.detectTest();
    }

     void detectTest() {

        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(12);
        this.check(expectedResult, actualResult,"test detect");
        expectedResult = "Buzz";
        actualResult = fizzBuzz.detect(10);
        this.check(expectedResult, actualResult,"test detect ");
        expectedResult = "FizzBuzz";
        actualResult = fizzBuzz.detect(15);
        this.check(expectedResult, actualResult,"test detect ");
    }

     void check(String expectedResult, String actualResult, String testName) {
        if (expectedResult.equals(actualResult)) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
