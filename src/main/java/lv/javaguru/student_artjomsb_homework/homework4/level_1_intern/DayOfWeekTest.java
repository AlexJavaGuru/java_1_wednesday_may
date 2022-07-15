package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;


class DayOfWeekTest {
    public static void main(String[] args) {
        DayOfWeekTest runner = new DayOfWeekTest();
        runner.checkFirstDay();
        runner.checkLastDay();
        runner.checkRandomNumber();
    }

    void checkFirstDay() {
        DayOfWeek victim = new DayOfWeek();
        String expectedResult = "Monday";
        int dayNumber = 1;
        check(expectedResult, victim.dayOfWeek(dayNumber), "Test First Day");
        check(expectedResult, victim.dayOfWeekTwo(dayNumber), "Test First Day");
    }

    void checkLastDay() {
        DayOfWeek victim = new DayOfWeek();
        String expectedResult = "Sunday";
        int dayNumber = 7;
        check(expectedResult, victim.dayOfWeek(dayNumber), "Test Last Day");
        check(expectedResult, victim.dayOfWeekTwo(dayNumber), "Test Last Day");
    }

    void checkRandomNumber() {
        DayOfWeek victim = new DayOfWeek();
        String expectedResult = "Wrong number!";
        int dayNumber = (int) Math.floor(Math.random() * 100);
        System.out.println(dayNumber);
        check(expectedResult, victim.dayOfWeek(dayNumber), "Test Random Number");
        check(expectedResult, victim.dayOfWeekTwo(dayNumber), "Test Random Number");
    }

    public void check(String expectedResult, String actualResult, String testName) {
        boolean isPassed = expectedResult.equals(actualResult);
        if (isPassed) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }

}

