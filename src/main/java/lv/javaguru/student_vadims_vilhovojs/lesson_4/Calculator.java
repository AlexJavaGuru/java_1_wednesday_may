package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

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

    public double div(int firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    public boolean isEven(int number) {
        boolean isEven = true;
        if (number % 2 == 0) {
            isEven = true;
            return true;
        } else if (number % 2 != 0) {
            isEven = false;
            return false;
        }
        return isEven;
    }

    public int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        int maxOfTwoNumbers = Math.max(firstNumber, secondNumber);
        return maxOfTwoNumbers;

    }

    public int maxOfThreeNumbers(int firstNumber, int secondNumber, int thirdNumber) {
        int maxOfThreeNumbers = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        return maxOfThreeNumbers;
    }
}