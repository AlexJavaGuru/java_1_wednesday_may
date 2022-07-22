package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_1_2_3;

import java.util.Scanner;

class NumberChecker {

    public static void main(String[] args) {

        NumberChecker numberChecker = new NumberChecker();
        Scanner scanner = new Scanner(System.in);

        numberChecker.areAllEqualOrDifferent(3, 6, 6);

        System.out.println("Enter number1 :");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2 :");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3 :");
        int number3 = scanner.nextInt();

        numberChecker.areIncreasingOrDecreasingOrder(number1, number2, number3);

        System.out.println("Enter number1 :");
        number1 = scanner.nextInt();
        System.out.println("Enter number2 :");
        number2 = scanner.nextInt();
        System.out.println("Enter number3 :");
        number3 = scanner.nextInt();

        System.out.println("Max number :" +
                numberChecker.getMaxNumberWithThreeNumbers(number1, number2, number3)
        );


    }

    //task 2
    boolean isPositive(int number) {

        return number > 0;
    }

    //task 3
    String whatIsDayOfTheWeek(int dayNumber) {

        String result = "Unknown";

        switch (dayNumber) {
            case 1:
                result = "Monday";
                break;
            case 2:
                result = "Tuesday";
                break;
            case 3:
                result = "Wednesday";
                break;
            case 4:
                result = "Thursday";
                break;
            case 5:
                result = "Friday";
                break;
            case 6:
                result = "Saturday";
                break;
            case 7:
                result = "Sunday";
                break;
        }

        System.out.println("This day number name is: " + result);

        return result;
    }

    //task 4
    boolean isEven (int number) {

        return number % 2 == 0;
    }

    //task 5
    int getMaxNumber(int number1, int number2) {
        if (number1 > number2 ) {
            return number1;
        }

        return number2;
    }

    //task 6
    int getMinNumber(int number1, int number2) {

        return (number1 < number2) ? number1 : number2;
    }

    //task 7
    boolean areEqualNumbers(int number1, int number2) {

        return number1 == number2;
    }

    //task 8
    void areAllEqualOrDifferent(int number1, int number2, int number3) {
        if(number1 == number2 && number2 == number3) {
            System.out.println("All numbers are equals!");
        } else if (number1 != number2 && number2 != number3 && number1 != number3) {
            System.out.println("All numbers are different!");
        } else {
            System.out.println("Numbers Neither all are equal or different!");
        }
    }

    //task 9
    void areIncreasingOrDecreasingOrder(int number1, int number2, int number3) {
        if(number1 < number2 && number2 < number3) {
            System.out.println("Increasing order!");
        } else if (number1 > number2 && number2 > number3) {
            System.out.println("Decreasing order!");
        } else {
            System.out.println("Neither increasing or decreasing order!");
        }
    }

    //task 10
    int getMaxNumberWithThreeNumbers(int number1, int number2, int number3) {
        if (number2 > number1 && number2 > number3) {
            return number2;
        } else if (number3 > number1 && number3 > number2) {
            return number3;
        }

        return number1;
    }
}
