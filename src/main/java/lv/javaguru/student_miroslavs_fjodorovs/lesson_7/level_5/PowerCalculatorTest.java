package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();
        powerCalculatorTest.powerTestPositive();
        powerCalculatorTest.powerTestNegative();
    }

    PowerCalculator powerCalculator = new PowerCalculator();

    void powerTestPositive() {
        int result = powerCalculator.power(7,2);
        check(result == 49, "Positive number test");
    }

    void powerTestNegative() {
        int result = powerCalculator.power(-4, 3);
        check(result == -64, "Negative number test");
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
