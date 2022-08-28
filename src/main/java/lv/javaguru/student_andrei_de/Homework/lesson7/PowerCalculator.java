package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

class PowerCalculator {

    int power(int number, int powerNumber) {
        int result  = 1;
        for (int i = 1; i <= powerNumber; i++) {
            result = result * number;
        }
        return result;
    }
}
