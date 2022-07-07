package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_4;

public class Calculator {
    public int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int min(int firstNumber, int secondNumber) {
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

    public int maxOfTwoNumbers1(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfTwoNumbers2(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }

    public int maxOfTwoNumbers3(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }


    public int maxOfThreeNumbers(int first, int second, int third) {

        if (first > second && first > third) {
            return first;
        } else if (second > first && second > third) {
            return second;
        } else if (third > first && third > second) {
            return third;
        } else if (first == second && first > third) {
            return first;
        } else if (second == third && second > first) {
            return second;
        } else if (third == first && third > second) {
            return third;
        } else {
            return first;

        }

    }
}







