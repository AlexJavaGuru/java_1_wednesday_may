package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_4.Task_22;

class FizzBuzzTest {

    public static void main(String[] args) {

        FizzBuzzTest fizzBuzzTest = new FizzBuzzTest();
        fizzBuzzTest.fizzTest();
        fizzBuzzTest.buzzTest();
        fizzBuzzTest.fizzBuzzTest();
        fizzBuzzTest.notFizzBuzzTest();
    }

    void fizzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 3;
        String expectedResult = "Fizz";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "Task Fizz");
    }

    void buzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 5;
        String expectedResult = "Buzz";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "Task Buzz");
    }

    void fizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 15;
        String expectedResult = "FizzBuzz";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "Task FizzBuzz");
    }
    void notFizzBuzzTest() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        int number = 4;
        String expectedResult = "4";
        String realResult = fizzBuzz.detect(number);
        check(expectedResult, realResult, "Not FizzBuzz" );
    }

    void check(String expectedResult, String realResult, String taskName) {
        if (expectedResult.equals(realResult)) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}