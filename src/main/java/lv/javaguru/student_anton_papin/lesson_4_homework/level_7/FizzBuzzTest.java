package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_7;

import java.util.Objects;

public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzzTest test = new FizzBuzzTest();
        test.fizzTest();
        test.buzzTest();
        test.fizzBuzzTest();
        test.fizzBuzzReturnTest();
    }

    public void check(String expectResult, String actualResult, String testName) {
        if (Objects.equals(expectResult, actualResult)) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectResult + " but actual result: " + actualResult);
        }
    }

    public void fizzTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 12;
        String expectResult = "Fizz";
        String actualResult = subject.detect(number);
        check(expectResult, actualResult, "Fizz");
    }

    public void buzzTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 5;
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

    public void fizzBuzzReturnTest() {
        FizzBuzz subject = new FizzBuzz();
        int number = 4;
        String expectResult = "4";
        String actualResult = subject.detect(number);
        check(expectResult, actualResult, "FizzBuzzReturn");
    }
}
