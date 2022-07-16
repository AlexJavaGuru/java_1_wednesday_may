package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_7;

class LeapYearTest {

    public static void main(String[] args) {
        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.isLeapYearTest();
        leapYearTest.isNotLeapYearTest();
    }

    private void isLeapYearTest() {
        LeapYear leapYear = new LeapYear();

        boolean actualResult = leapYear.isLeapYear(2012);
        this.check(actualResult, "is Leap Year Test");
    }

    private void isNotLeapYearTest() {
        LeapYear leapYear = new LeapYear();

        boolean actualResult = leapYear.isLeapYear(1933);
        this.check(!actualResult, "is Not Leap Year Test");
    }

    private void check(boolean expectedResult, String testName) {
        if (expectedResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + !expectedResult);
        }
    }
}
