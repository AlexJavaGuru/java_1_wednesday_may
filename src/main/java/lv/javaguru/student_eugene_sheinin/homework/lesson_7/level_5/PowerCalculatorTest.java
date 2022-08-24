package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_5;

public class PowerCalculatorTest {

    public static void main(String[] args) {
        System.out.println(PowerCalculator.power(7, 8));
        System.out.println(PowerCalculator.power(5.4, 3));

        testPowerWithInt();
        testPowerWithDouble();
    }

    private static void testPowerWithInt() {
        check(PowerCalculator.power(7, 8) == 5764801, "Test power");
    }

    private static void testPowerWithDouble() {
        check(PowerCalculator.power(5.4, 3) == 157.46, "Test power");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
