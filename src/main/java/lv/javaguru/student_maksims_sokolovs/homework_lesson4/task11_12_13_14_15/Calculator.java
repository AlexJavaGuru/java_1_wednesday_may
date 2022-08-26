package lv.javaguru.student_maksims_sokolovs.homework_lesson4.task11_12_13_14_15;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int mul(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int result;
        if (firstNumber > secondNumber) {
            result = firstNumber;
        } else if (firstNumber < secondNumber) {
            result = secondNumber;
        } else {
            result = firstNumber;
        }
        return result;
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int result = 0;
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            result = firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            result = secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            result = thirdNumber;
        } else if (firstNumber == secondNumber && firstNumber > thirdNumber) {
            result = firstNumber;
        } else if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            result = firstNumber;
        }
        return result;
    }

}