package main.java.lv.javaguru.student_rodions_pismennijs.lesson_6.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.notFizzBuzzTest();
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    FizzBuzz fizzBuzz = new FizzBuzz();

    public void fizzTest() {
        check(fizzBuzz.detect(9).equals("Fizz"), "Fizz");
    }

    public void buzzTest() {
        check(fizzBuzz.detect(20).equals("Buzz"), "Buzz");
    }

    public void fizzBuzzTest() {
        check(fizzBuzz.detect(15).equals("FizzBuzz"), "FizzBuzz");
    }

    public void notFizzBuzzTest() {
        check(fizzBuzz.detect(8).equals("8"), "NotFizzBuzz");
    }
}
