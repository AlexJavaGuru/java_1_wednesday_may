package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearTest();
    }

    private void isLeapYearTest() {
        LeapYear leapYear = new LeapYear();
        boolean actualResult = leapYear.isLeapYear(1952);
        this.check(true, actualResult,"is Leap Year Test");

        actualResult = leapYear.isLeapYear(1933);
        this.check(false, actualResult,"is Leap Year Test");

        actualResult = leapYear.isLeapYear(2012);
        this.check(true, actualResult,"is Leap Year Test");
    }

    private void check(boolean expectedResult, boolean actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
