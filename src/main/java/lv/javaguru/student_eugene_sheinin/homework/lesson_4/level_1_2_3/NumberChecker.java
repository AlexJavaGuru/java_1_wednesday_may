package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_1_2_3;

import java.util.Scanner;

public class NumberChecker {

    public static void main(String[] args) {

        NumberChecker numberChecker = new NumberChecker();
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter number for positive or negative checking please :");
//
//        int inputNumber = scanner.nextInt();
//
//        numberChecker.positiveOrNegative(inputNumber);
//
//        System.out.println("Enter number the day of a week number please :");
//
//        int dayNumber = scanner.nextInt();
//
//        numberChecker.whatIsDayOfTheWeek(dayNumber);
//
//        System.out.println("Enter number1 for get max number :");
//
//        int number1 = scanner.nextInt();
//
//        System.out.println("Enter number2 for get max number :");
//
//        int number2 = scanner.nextInt();
//
//        numberChecker.getMaxNumber(number1, number2);

        numberChecker.areAllEqualOrDifferent(3, 6, 6);

//        System.out.println("Enter number1 :");
//
//        int number1 = scanner.nextInt();
//
//        System.out.println("Enter number2 :");
//
//        int number2 = scanner.nextInt();
//
//        System.out.println("Enter number3 :");
//
//        int number3 = scanner.nextInt();
//
//        numberChecker.areIncreasingOrDecreasingOrder(number1, number2, number3);
        System.out.println("Enter number1 :");

        int number1 = scanner.nextInt();

        System.out.println("Enter number2 :");

        int number2 = scanner.nextInt();

        System.out.println("Enter number3 :");

        int number3 = scanner.nextInt();

        numberChecker.getMaxNumberWithThreeNumbers(number1, number2, number3);


    }

    //task 2
    String positiveOrNegative(int number) {

        String result = "positive";

        if (number < 0) {
            result = "negative";
        } else if (number == 0) {
            result = "zero";
        }

        System.out.println(result);

        return result;
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
    String oddOrEven (int number) {

        String result = "Odd";

        if (number % 2 == 0) {
            result = "Even";
        }

        System.out.println("This number is: " + result);

        return result;
    }

    //task 5
    int getMaxNumber(int number1, int number2) {

        int max = number1;

        if (number1 != number2 ) {
            if (number1 < number2 ) {
                max = number2 ;
            }
        } else {
            System.out.println("Numbers are equal!");
        }

        System.out.println("Max number is " + max);

        return max;
    }

    //task 6
    int getMinNumber(int number1, int number2) {

        int min = number1;

        if (number1 != number2 ) {
            if (number1 > number2 ) {
                min = number2 ;
            }
        } else {
            System.out.println("Numbers are equal!");
        }

        System.out.println("Min number is " + min);

        return min;
    }

    //task 7
    boolean areEqualNumbers(int number1, int number2) {

        //boolean for test assertion
        boolean equal = true;
        String result = "equal";

        if (number1 != number2 ) {

            equal = false;
            result = "not equal";
        }

        System.out.println("Numbers are "+ result +"!");

        return equal;
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
        int max = number1;
        if (number2 > number1 && number2 > number3) {
            max = number2;
        } else if (number3 > number1 && number3 > number2) {
            max = number3;
        }

        System.out.println("Max number is " + max);

        return max;
    }
}
