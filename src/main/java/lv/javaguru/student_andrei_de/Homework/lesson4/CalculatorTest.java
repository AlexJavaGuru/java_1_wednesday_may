package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;

import java.nio.channels.CancelledKeyException;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();

    }

    public void sumTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 15;
        Calculator calculator = new Calculator();
        int realResult = calculator.plus(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = Fail");
        }
    }

    public void firstNumberGreaterThanSecond() {
        int firstNumber = 4;
        int secondNumber = 3;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        } else {
            System.out.println("MaxOfTwoNumbers test = Fail");
        }
    }

    public void secondNumberGreaterThanFirst() {
        int firstNumber = 10;
        int secondNumber = 34;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("MaxOfTwoNumbers test = OK");
        }else{
            System.out.println("MaxOfTwoNumbers test = Fail");
        }
    }

    public void numbersIsEquals(){
        int firstNumber = 5;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber, secondNumber);
        if (realResult == expectedResult){
            System.out.println("MaxOfTwoNumbers test = OK");
        }else{
            System.out.println("MaxOfTwoNumbers test = Fail");
        }
    }
    public void firstNumberBiggerThanSecondAndThird(){
        int firstNumber = 7;
        int secondNumber = 3;
        int thirdNumber = 1;
        int expectedResult = firstNumber;
        Calculator calculator = new Calculator ();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult){
            System.out.println("MaxOfThreeNumbers test = OK");
        }else{
            System.out.println("MaxOfThreeNumbers test = Fail");
        }

    }
    public void secondNumberBiggerThanFirstAndThird(){
        int firstNumber = 56;
        int secondNumber = 77;
        int thirdNumber = 9;
        int expectedResult = secondNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult){
            System.out.println("MaxOfThreeNumbers test = OK");
        }else{
            System.out.println("MaxOfThreeNumbers test = Fail");
        }
    }
    public void thirdNumberBiggerThanSecondAndFirst(){
        int firstNumber = 45;
        int secondNumber = 49;
        int thirdNumber = 50;
        int expectedResult = thirdNumber;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult){
            System.out.println("MaxOfThreeNumbers = OK");
        }else{
            System.out.println("MaxOfThreeNumbers = Fail");
        }
    }
    public void BothNumbersEqualsAndBiggerThanThird(){
        int firstNumber = 22;
        int secondNumber = 22;
        int thirdNumber = 21;
        int expectedResult = 22;
        Calculator calculator =  new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult){
            System.out.println("MaxOfThreeNumbers = OK");
        }else{
            System.out.println("MaxOfThreeNumbers = Fail");
        }
    }
    public void ThreeNumbersAreEquals(){
        int firstNumber = 1;
        int secondNumber = 1;
        int thirdNumber = 1;
        int expectedResult = 1;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber);
        if (realResult == expectedResult){
            System.out.println("MaxOfThreeNumbers = OK");
        }else{
            System.out.println("MaxOfThreeNumbers = Fail");
        }
    }
}
