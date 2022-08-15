package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

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
            System.out.println(testName + " - Fail");
        }
    }

    PowerCalculator powerCalculator = new PowerCalculator();

    void powerTest1() {
        int result = powerCalculator.power(9,2);
        check(result ==  81, "Power 9^2 test");
    }

    void powerTest2() {
        int result = powerCalculator.power(2,3);
        check(result == 8, "Power 2^3 test");
    }

}
