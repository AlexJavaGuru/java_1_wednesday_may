package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_5_middle;

import java.util.Scanner;

class PowerCalculator {

    private double number;

    private double degree;

    private double numberToThePower = 1;

    void askUserNumber() {
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Please input number: ");
        setNumber(numberInput.nextDouble());
    }

    void askUserDegree() {
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Please input degree: ");
        setDegree(numberInput.nextDouble());
    }

    String
    exponentiation() {
        if (degree == 0) {
            numberToThePower = 1;
        } else if (number == 0) {
            if (degree > 0) {
                numberToThePower = 0;
            } else {
                return "0 cannot be in negative power";
            }
        } else if (isDegreePositive() && isDegreeInteger()) {
            exponentiationDegreeIntegerPositive();
        } else if (!isDegreePositive() && isDegreeInteger()) {
            exponentiationDegreeIntegerNegative();
        } else if (isDegreePositive() && !isDegreeInteger() && isNumberPositive()) {
            exponentiationDegreeFractionalPositive();
        } else if (!isDegreePositive() && !isDegreeInteger() && isNumberPositive()) {
            exponentiationDegreeFractionalNegative();
        } else {
            return "Error!";
        }
        return "" + numberToThePower;
    }

    void exponentiationDegreeIntegerPositive() {
        for (int i = 0; i < degree; i++) {
            numberToThePower *= number;
        }
    }

    void exponentiationDegreeFractionalNegative() {
        for (int i = 0; i > degree + 1; i--) {
            numberToThePower *= 1 / number;
        }
        numberToThePower *= 1 / Math.exp(Math.log(number) / (1 / findNumberAfterComaInDegree()));
    }

    void exponentiationDegreeFractionalPositive() {                      //Это вариант менее точный, но в одну строку
                                                                        //numberToThePower = Math.exp(Math.log(number) * (degree));
        for (int i = 0; i < degree - 1; i++) {
            numberToThePower *= number;
        }
        numberToThePower *= Math.exp(Math.log(number) * (findNumberAfterComaInDegree()));
    }

    double findNumberAfterComaInDegree() {
        String numberInString = "" + degree;
        String numberAfterComa = "0." + numberInString.substring(numberInString.indexOf(".") + 1);
        return Double.parseDouble(numberAfterComa);
    }

    void exponentiationDegreeIntegerNegative() {
        for (int i = 0; i > degree; i--) {
            numberToThePower *= 1 / number;
        }
    }

    boolean isNumberPositive() {
        return number > 0;
    }

    boolean isDegreePositive() {
        return degree > 0;
    }

    boolean isDegreeInteger() {
        String numberInString = "" + degree;
        String numberAfterComa = numberInString.substring(numberInString.indexOf(".") + 1);
        return numberAfterComa.equals("0");
    }

    public double getDegree() {
        return degree;
    }

    public double getNumber() {
        return number;
    }

    public double getNumberToThePower() {
        return numberToThePower;
    }


    public void setNumber(double number) {
        this.number = number;
    }

    public void setDegree(double degree) {
        this.degree = degree;
    }
}
