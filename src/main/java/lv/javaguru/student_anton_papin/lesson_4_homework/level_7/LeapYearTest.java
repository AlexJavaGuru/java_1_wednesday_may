package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_7;

public class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.year10(10);
        test.year60(60);
        test.year400(400);
        test.year600(600);
        test.year2023(2023);
        test.year2027(2027);
    }

    public LeapYear subject = new LeapYear();

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

    public void year10(int year) {
        boolean result = subject.isLeapYear(year);
        check(!result, "10");
    }

    public void year60(int year) {
        boolean result = subject.isLeapYear(year);
        check(result, "60");
    }

    public void year400(int year) {
        boolean result = subject.isLeapYear(year);
        check(result, "400");
    }

    public void year600(int year) {
        boolean result = subject.isLeapYear(year);
        check(!result, "600");
    }

    public void year2023(int year) {
        boolean result = subject.isLeapYear(year);
        check(!result, "2023");
    }

    public void year2027(int year) {
        boolean result = subject.isLeapYear(year);
        check(result, "2027");
    }
}

