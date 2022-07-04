package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_4junior.task_12;


import main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_4junior.task_11.Calculator11;

class CalculatorTest {

    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        calculatorTest.sumTest();
        calculatorTest.subTest();
        calculatorTest.divTest();
        calculatorTest.multTest();
        calculatorTest.isEvianTest();
        calculatorTest.firNumMax();
        calculatorTest.secNumMax();
        calculatorTest.bothEqual();
        calculatorTest.firstBigSecAnThir();
        calculatorTest.secBigFirstAnThird();
        calculatorTest.thirdBigFirstAnSec();
        calculatorTest.firsAnSecSamBigstThird();
        calculatorTest.secAndThirdBigestFirst();
        calculatorTest.firstAnThirdEqualAnBigSec();

    }
    public void sumTest() {
        int firstNumber = 10;  // подготавливаем тестовые данные
        int secondNumber = 5;  // подготавливаем тестовые данные
        int expectedResult = 15;  // подготавливаем тестовые данные
        Calculator calculator = new Calculator();
        int realResult = calculator.sum(firstNumber, secondNumber);  // вызываем продакшен код, который хотим протестировать
        if (realResult == expectedResult) {  // проверяем правильно ли сработал тестируемый код
            System.out.println("Sum test = OK");
        } else {
            System.out.println("Sum test = FAIL");
        }
    }
    public void subTest() {
        int firstNumber = 10;
        int secondNumber = 5;
        int expectedResult = 5;
        Calculator calculator = new Calculator();
        int realResult = calculator.sub(firstNumber, secondNumber);
        if (realResult == expectedResult) {
            System.out.println("Sub test = OK");
        } else {
            System.out.println("Sub test = FAIL");
        }
    }
    public void divTest(){
        int firstNumber = 21;
        int secondNumber = 7;
        int expectedResult = 3;
        Calculator calculator = new Calculator();
        int realResult = calculator.div(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("Div test = OK");
        }else {
            System.out.println("Div test = FAIL");
        }
    }
    public void multTest(){
        int firstNumber = 10;
        int secondNumber = 10;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.mult(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("Mult test = OK");
        }else {
            System.out.println("Mult test = FAIL");
        }
    }
    public void isEvianTest(){
        int number = 10;
        boolean expectedResult = true;
        Calculator calculator = new Calculator();
        boolean realResult = calculator.isEven(number);
        if (realResult == expectedResult){
            System.out.println("IsIevian test = OK");
        }else {
            System.out.println("IsEvian test = FAIL");
        }
    }
    public void firNumMax(){
        int firstNumber = 100;
        int secondNumber = 90;
        int expectedResult= 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("FirstMax test is OK");
        }else {
            System.out.println(("First number test  Max is FAIL"));
        }
    }

    public void secNumMax(){
        int firsNum = 10;
        int secNum = 30;
        int expectedResult = 30;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firsNum,secNum);
        if (realResult == expectedResult){
            System.out.println("SecNumMax test is OK");
        }else {
            System.out.println("SecNumMax test is FAIL");
        }
    }
    public void bothEqual(){
        int firstNumber = 100;
        int secondNumber = 100;
        int expectedResult = 0;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfTwoNumbers(firstNumber,secondNumber);
        if (realResult == expectedResult){
            System.out.println("BothEqual test is OK");
        }else {
            System.out.println("BothEqual test is FAIL");
        }
    }

    public void firstBigSecAnThir (){
        int firstNumber = 100;
        int secondNumber = 20;
        int thirdNumber = 30;
        int exprctedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNumber,secondNumber,thirdNumber);
        if (realResult == exprctedResult){
            System.out.println("FirstBigest test is OK");
        }else {
            System.out.println("FirstBigest tets is FAIL");
        }
    }
    public void secBigFirstAnThird (){
        int firstNum = 100;
        int secNum = 200;
        int thirdNum = 30;
        int expectedResult = 200;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum,secNum,thirdNum);
        if (realResult == expectedResult){
            System.out.println("SecondNumBig test is OK");
        } else {
            System.out.println("SecondNumBig test is FAIL");
        }
    }
    public void thirdBigFirstAnSec(){
        int firstNum = 1;
        int secNum = 2;
        int thirdNum = 100;
        int expectedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum,secNum,thirdNum);
        if(realResult == expectedResult){
            System.out.println("ThirdBigest test is OK");
        }else {
            System.out.println("ThirdBigest test is FAIL");
        }
    }
    public void firsAnSecSamBigstThird(){
        int firstNum = 100;
        int secNum = 100;
        int thirdNum = 50;
        int exprctedResult = 200;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum,secNum,thirdNum);
        if(exprctedResult == realResult){
            System.out.println("FirstAndSecBigest test is OK");
        }else {
            System.out.println("FirstAndSecBigest test is FAIL");
        }
    }

    public void secAndThirdBigestFirst(){
        int firstNum = 30;
        int secNum = 50;
        int thirdNum = 50;
        int exprctedResult = 100;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum,secNum,thirdNum);
        if(exprctedResult == realResult){
            System.out.println("SecAndThirdEqualBigstFirst test is OK");
        }else {
            System.out.println("SecAndThirdEqualBigstFirst test is FAIL");
        }
    }
    public void firstAnThirdEqualAnBigSec(){
        int firstNum = 100;
        int secNum = 50;
        int thirdNum = 100;
        int exprctedResult = 200;
        Calculator calculator = new Calculator();
        int realResult = calculator.maxOfThreeNumbers(firstNum,secNum,thirdNum);
        if(exprctedResult == realResult){
            System.out.println("FirstAnThirdEqualAnBigSec test is OK");
        }else {
            System.out.println("FirstAnThirdEqualAnBigSec test is FAIL");
        }
    }

}