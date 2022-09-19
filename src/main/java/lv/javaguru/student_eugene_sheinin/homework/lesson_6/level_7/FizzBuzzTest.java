package lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_7;

class FizzBuzzTest {

    public static void main(String[] args) {
        testDetectFizz();
        testDetectBuzz();
        testDetectFizzBuzz();
    }

    static void testDetectFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(
                fizzBuzz.detect(9).equals("Fizz"),
                "test Detect Fizz"
        );
    }

    static void testDetectBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(
                fizzBuzz.detect(10).equals("Buzz"),
                "test Detect Buzz"
        );
    }

    static void testDetectFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        check(
                fizzBuzz.detect(15).equals("FizzBuzz"),
                "test Detect Fizz Buzz"
        );
    }

    static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
