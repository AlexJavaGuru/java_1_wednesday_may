package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_1.FizzBuzzTest;

class FizBuzzTest {

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
        check(fizzBuzz.detect(15).equals("Buzz"), "Buzz");
    }

    public void fizzBuzzTest() {
        check(fizzBuzz.detect(15).equals("FizzBuzz"), "FizzBuss");
    }

    public void notFizzBuzzTest() {
        check(fizzBuzz.detect(6).equals("6"), "NotFizzBuzz");
    }
}
