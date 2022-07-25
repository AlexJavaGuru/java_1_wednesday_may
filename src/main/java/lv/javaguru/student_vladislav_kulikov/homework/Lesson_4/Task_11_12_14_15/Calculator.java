package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_4.Task_11_12_14_15;

class Calculator {

    public int sumAddition(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int sumSubtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public double sumDivision(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public int sumMultiplication(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
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
        } else if (firstNumber == secondNumber) {
            result = secondNumber;
        }
        return result;
    }
}
