package lv.javaguru.student_artjomsb_homework.homework4.level_7_senior;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest runner = new FizzBuzzTest();
        runner.testBuzz();
        runner.testFizz();
        runner.testFizzBuzz();
        runner.testNotFizzBuzz();
    }

    void testFizz() {
        FizzBuzz victim = new FizzBuzz();
        check(victim.detect(9).equals("Fizz"), "Test Fizz");
    }

    void testBuzz() {
        FizzBuzz victim = new FizzBuzz();
        check(victim.detect(40).equals("Buzz"), "Test Buzz");
    }

    void testFizzBuzz() {
        FizzBuzz victim = new FizzBuzz();
        check(victim.detect(15).equals("FizzBuzz"), "Test FizzBuzz");
    }

    void testNotFizzBuzz() {
        FizzBuzz victim = new FizzBuzz();
        check(victim.detect(43).equals("43"), "Test Number");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
