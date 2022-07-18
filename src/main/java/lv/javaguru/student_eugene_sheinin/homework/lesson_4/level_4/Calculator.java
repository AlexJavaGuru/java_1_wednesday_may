package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public double div(int firstNumber, int secondNumber) {
        return (double) firstNumber / secondNumber;
    }

    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {

        if(secondNumber > firstNumber ) {
            return secondNumber;
        }

        return firstNumber;
    }

    public int maxOfThreeNumbers(int number1, int number2, int number3) {

        if (number2 > number1 && number2 > number3) {
            return number2;
        } else if (number3 > number1 && number3 > number2) {
            return number3;
        }

        return number1;
    }
}
