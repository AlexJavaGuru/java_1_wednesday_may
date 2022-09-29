package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.noFizzNoBuzzTest();
    }

    FizzBuzz fizzBuzz = new FizzBuzz();

    public void fizzTest() {
        check(fizzBuzz.detect(12).equals("Fizz"), "Fizz Test");
    }

    public void buzzTest() {
        check(fizzBuzz.detect(20).equals("Buzz"), "Buzz Test");
    }

    public void fizzBuzzTest() {
        check(fizzBuzz.detect(30).equals("FizzBuzz"), "FizzBuzz Test");
    }

    public void noFizzNoBuzzTest() {
        check(fizzBuzz.detect(7).equals("7"), "No Fizz, No Buzz Test");
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
