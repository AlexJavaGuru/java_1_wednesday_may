package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_4_junior;

class Calculator {

    int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    int subtraction(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    boolean isEven(int number) {
        return number % 2 == 0;
    }
    int maxOfTwoNumbers(int firstNumber, int secondNumber) {
        return Math.max(firstNumber,secondNumber);
    }
    int maxOfThreeNumbers(int numOne, int numTwo, int numThree) {
        int[] numbers = {numOne, numTwo, numThree};
        int largestNumber = numOne;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                largestNumber = numbers[i + 1];
            }
        }
        return largestNumber;
    }
}