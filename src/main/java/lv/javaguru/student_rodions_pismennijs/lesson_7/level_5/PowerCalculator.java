package lv.javaguru.student_rodions_pismennijs.lesson_7.level_5;

class PowerCalculator {

    int power(int number, int powerNumber) {
        int result = 1;
        for (int i = 1; i <= powerNumber; i++) {
            result = result * number;
        }
        return result;
    }
}
