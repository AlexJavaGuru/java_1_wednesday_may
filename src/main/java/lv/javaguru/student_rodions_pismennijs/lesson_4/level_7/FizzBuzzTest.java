package main.java.lv.javaguru.student_rodions_pismennijs.lesson_4.level_7;

import java.util.Objects;

class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.notFizzBuzzTest();
    }

    public void check(String expectResult, String actualResult, String testName) {
        if (Objects.equals(expectResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectResult + " but actual is: " + actualResult);
        }
    }

    public void fizzTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 9;
        String expectResult = "Fizz";
        String actualResult = subject.detect(number);
        check(expectResult, actualResult, "Fizz");
    }

    public void buzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 20;
        String expectResult = "Buzz";
        String actualResult = subject.detect(number);
        check(expectResult, actualResult, "Buzz");
    }

    public void fizzBuzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 15;
        String expectResult = "FizzBuzz";
        String actualResult = subject.detect(number);
        check(expectResult, actualResult, "FizzBuzz");
    }

    public void notFizzBuzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 8;
        String expectResult = "8";
        String actualResult = subject.detect(number);
        check(expectResult, actualResult, "NotFizzBuzz");
    }
}
