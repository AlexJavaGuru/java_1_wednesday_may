package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_9;

class PowerCalculator {

    double gettingAnswer(int number, int degree) {
        double result = resultOfExponentiation(number, degree);
        return result;
    }

    double resultOfExponentiation(int number, int degree) {
        int result = 1;
        for (int i = 1; i <= degree; i++) {
            result = result * number;
        }
        return result;
    }
}

