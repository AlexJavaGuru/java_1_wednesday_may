package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_4.task_11_12_13_14;

class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int division(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public int twoMaxNumbers(int firstNumber, int secondNumber) {
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

    public int twoMaxNumbersT(int firstNumber, int secondNumber) {
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

    public int twoMaxNumbersTt(int firstNumber, int secondNumber) {
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
}
