package lv.javaguru.student_rodions_pismennijs.lesson_4.level_7;

class LeapYearTest {
    public static void main(String[] args) {
        LeapYearTest test = new LeapYearTest();
        test.year2(2);
        test.year80(80);
        test.year400(400);
        test.year500(500);
        test.year2022(2022);
        test.year2024(2024);
    }

    private LeapYear subject = new LeapYear();

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
        }
    }

    public void year2(int year) {
        boolean result = subject.isLeapYear(year);
        check(!result, "2");
    }

    public void year80(int year) {
        boolean result = subject.isLeapYear(year);
        check(result, "80");
    }

    public void year400(int year) {
        boolean result = subject.isLeapYear(year);
        check(result, "400");
    }

    public void year500(int year) {
        boolean result = subject.isLeapYear(year);
        check(!result, "500");
    }

    public void year2022(int year) {
        boolean result = subject.isLeapYear(year);
        check(!result, "2022");
    }

    public void year2024(int year) {
        boolean result = subject.isLeapYear(year);
        check(result, "2024");
    }
}
