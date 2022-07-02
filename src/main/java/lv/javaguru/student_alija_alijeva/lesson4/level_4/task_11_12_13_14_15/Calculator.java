package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_4.task_11_12_13_14_15;

class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int dif(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int maxNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else if (firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }

    public int threeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        if (firstNumber > secondNumber && firstNumber > thirdNumber) {
            return firstNumber;
        } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
            return thirdNumber;
        } else if (secondNumber == firstNumber && secondNumber > thirdNumber) {
            return secondNumber;
        } else if (firstNumber == thirdNumber && firstNumber > secondNumber) {
            return firstNumber;
        } else if (secondNumber == thirdNumber && secondNumber > firstNumber) {
            return secondNumber;
        } else if (secondNumber == firstNumber && secondNumber < thirdNumber) {
            return thirdNumber;
        } else if (secondNumber == thirdNumber && secondNumber < firstNumber) {
            return firstNumber;
        } else if (firstNumber == thirdNumber && firstNumber < secondNumber) {
            return secondNumber;
        } else {
            return firstNumber;
        }
    }
}
