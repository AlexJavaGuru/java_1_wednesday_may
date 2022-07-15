package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_7_senior;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest runner = new LeapYearTest();
        runner.testLeapYear(1224);
        runner.testLeapYearDivideOn400(1600);
        runner.testBasicYear(1241);
        runner.testBasicYearDivideBy100(1000);

    }

    void testLeapYear(int year) {
        LeapYear tester = new LeapYear();
        check(tester.isLeapYear(year), "Test Leap year Divide by 4 and not 100");
    }

    void testLeapYearDivideOn400(int year) {
        LeapYear tester = new LeapYear();
        check(tester.isLeapYear(year), "Test Leap year Divide by 400");

    }

    void testBasicYear(int year) {
        LeapYear tester = new LeapYear();
        check(!tester.isLeapYear(year), "Test Basic Year");
    }

    void testBasicYearDivideBy100(int year) {
        LeapYear tester = new LeapYear();
        check(!tester.isLeapYear(year), "Test Basic Year divide by 100");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
