package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_4junior.task_12;

public class Calculator {


    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {

        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;

    }

    public boolean isEven(int number) {
        int ostatok = number % 2;
        if (ostatok == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        if (result > 0 && result < firstNumber) {
            return firstNumber;
        } else if (result < 0 || result > firstNumber) {
            return secondNumber;
        } else {
            return result;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int summFirAnSec = firstNumber + secondNumber;
        int summSecAnThir = secondNumber + thirdNumber;
        int summFirAnThird = firstNumber + thirdNumber;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (firstNumber == secondNumber && summFirAnSec > thirdNumber) {
            return summFirAnSec;
        } else if (secondNumber == thirdNumber && summSecAnThir > firstNumber) {
            return summSecAnThir;
        } else if (firstNumber == thirdNumber && summFirAnThird > secondNumber) {
            return summFirAnThird;
        }
        return summFirAnSec;
    }
}


