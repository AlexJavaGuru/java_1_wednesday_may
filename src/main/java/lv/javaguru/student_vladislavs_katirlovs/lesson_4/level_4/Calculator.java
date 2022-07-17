package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_4;

class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sub(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int mult(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int div(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber) {
            return secondNumber;
        } else {
            return firstNumber & secondNumber;
        }
    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                return firstNumber;
            } else if (thirdNumber > firstNumber) {
                return thirdNumber;
            } else {
                return firstNumber & thirdNumber;
            }
        } else if (secondNumber > thirdNumber) {
            if (secondNumber > firstNumber) {
                return secondNumber;
            } else {
                return firstNumber & secondNumber;
            }
        } else if (thirdNumber > secondNumber) {
            return thirdNumber;
        } else {
            if (firstNumber == thirdNumber) {
                return firstNumber & secondNumber & thirdNumber;
            } else {
                return secondNumber & thirdNumber;
            }
        }
    }
}
