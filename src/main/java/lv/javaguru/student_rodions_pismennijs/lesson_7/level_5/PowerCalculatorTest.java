package lv.javaguru.student_rodions_pismennijs.lesson_7.level_5;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest test = new PowerCalculatorTest();
        test.powerTest1();
        test.powerTest2();
    }

    void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    PowerCalculator powerCalculator = new PowerCalculator();

    void powerTest1() {
        int result = powerCalculator.power(3, 3);
        check(result == 27, "Power 3^3 test");
    }

    void powerTest2() {
        int result = powerCalculator.power(8, 2);
        check(result == 64, "Power 8^2 test");
    }
}
