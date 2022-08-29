package lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_32;

class FizzBuzzTest {

    FizzBuzz subject = new FizzBuzz();

    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.noFizzBuzzTest();
    }

    void fizzBuzzTest() {
        String expectedResult = "FizzBuzz";
        String actualResult = subject.detect(15);
        check(expectedResult.equals(actualResult), "Fizz Buzz Test");
    }

    void fizzTest() {
        String expectedResult = "Fizz";
        String actualResult = subject.detect(6);
        check(expectedResult.equals(actualResult), "Fizz Test");
    }

    void buzzTest() {
        String expectedResult = "Buzz";
        String actualResult = subject.detect(10);
        check(expectedResult.equals(actualResult), "Buzz Test");
    }

    void noFizzBuzzTest() {
        String expectedResult = "1111";
        String actualResult = subject.detect(1111);
        check(expectedResult.equals(actualResult), "No Fizz Buzz Test");
    }

    void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
