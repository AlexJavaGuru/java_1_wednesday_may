package lv.javaguru.student_artjomsb_homework.homework6.level_7_senior;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest runner = new FizzBuzzTest();
        runner.testBuzz();
        runner.testFizz();
        runner.testFizzBuzz();
        runner.testWrongNumber();
    }

    void testFizz() {
        FizzBuzz tester = new FizzBuzz();
        tester.setInitialNumber(9);
        tester.detect();
        check(tester.getFizzBuzz().equals("Fizz"), "Test check Fizz");
    }

    void testBuzz() {
        FizzBuzz tester = new FizzBuzz();
        tester.setInitialNumber(25);
        tester.detect();
        check(tester.getFizzBuzz().equals("Buzz"), "Test check Buzz");
    }

    void testFizzBuzz() {
        FizzBuzz tester = new FizzBuzz();
        tester.setInitialNumber(75);
        tester.detect();
        check(tester.getFizzBuzz().equals("FizzBuzz"), "Test check FizzBuzz");
    }

    void testWrongNumber() {
        FizzBuzz tester = new FizzBuzz();
        tester.setInitialNumber(37);
        tester.detect();
        check(tester.getFizzBuzz().equals("37"), "Test check not Fizz not Buzz");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + ", has passed");
        } else {
            System.out.println("Test - " + testName + ", has failed");
        }
    }
}