package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_5_middle;

class PowerCalculatorTest {
    public static void main(String[] args) {
        testIsDegreeInteger();
        testIsDegreeNotInteger();
        testPositiveDegree();
        testNotPositiveDegree();
        testPositiveNumber();
        testNotPositiveNumber();
        testExponentiationDegreeIntegerNegative();
        testExponentiationDegreeIntegerPositive();
        testFindNumberAfterComa();
        testExponentiationDegreeFractionalPositive();
        testExponentiationDegreeFractionalNegative();


    }
    static void testExponentiationDegreeFractionalPositive(){
        PowerCalculator tester = new PowerCalculator();
        tester.setNumber(4);
        tester.setDegree(2.5);
        tester.exponentiationDegreeFractionalPositive();
        check(tester.getNumberToThePower() == 32, "Check number power when degree fractional and positive");
    }
    static void testExponentiationDegreeFractionalNegative(){
        PowerCalculator tester = new PowerCalculator();
        tester.setNumber(4);
        tester.setDegree(-1.5);
        tester.exponentiationDegreeFractionalNegative();
        check(tester.getNumberToThePower() == 0.125, "Check number power when degree fractional and negative");
    }

    static void testFindNumberAfterComa() {
        PowerCalculator tester = new PowerCalculator();
        tester.setDegree(-5536.52542154623);
        double result = tester.findNumberAfterComaInDegree();
        double expectedResult = 0.52542154623;
        check(result == expectedResult, "Find correct number after coma");
    }

    static void testExponentiationDegreeIntegerNegative() {
        PowerCalculator tester = new PowerCalculator();
        tester.setNumber(-4);
        tester.setDegree(-2);
        tester.exponentiationDegreeIntegerNegative();
        check(tester.getNumberToThePower() == 0.0625, "Check number power in negative degree");
    }

    static void testExponentiationDegreeIntegerPositive() {
        PowerCalculator tester = new PowerCalculator();
        tester.setNumber(-4.5);
        tester.setDegree(2);
        tester.exponentiationDegreeIntegerPositive();
        check(tester.getNumberToThePower() == 20.25, "Check number power in negative degree");
    }

    static void testPositiveNumber() {
        PowerCalculator tester = new PowerCalculator();
        tester.setNumber(0.00001);
        check(tester.isNumberPositive(), "Check positive number");
    }

    static void testNotPositiveNumber() {
        PowerCalculator tester = new PowerCalculator();
        tester.setNumber(0.00000);
        check(!tester.isNumberPositive(), "Check not positive number");
        tester.setNumber(-0.00001);
        check(!tester.isNumberPositive(), "Check negative number");
    }

    static void testPositiveDegree() {
        PowerCalculator tester = new PowerCalculator();
        tester.setDegree(0.00001);
        check(tester.isDegreePositive(), "Check positive degree");
    }

    static void testNotPositiveDegree() {
        PowerCalculator tester = new PowerCalculator();
        tester.setDegree(0.00000);
        check(!tester.isDegreePositive(), "Check not positive degree");
        tester.setDegree(-0.00001);
        check(!tester.isDegreePositive(), "Check negative degree");
    }

    static void testIsDegreeInteger() {
        PowerCalculator tester = new PowerCalculator();
        tester.setDegree(-23.0000);
        check(tester.isDegreeInteger(), "Check that degree Integer");
    }

    static void testIsDegreeNotInteger() {
        PowerCalculator tester = new PowerCalculator();
        tester.setDegree(-23.00001);
        check(!tester.isDegreeInteger(), "Check that degree Fractional");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
