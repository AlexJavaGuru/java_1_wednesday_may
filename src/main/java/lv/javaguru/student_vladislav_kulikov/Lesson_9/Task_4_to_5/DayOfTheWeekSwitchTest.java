package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_4_to_5;

class DayOfTheWeekSwitchTest {

    public static void main(String[] args) {
        mondayTest();
        tuesdayTest();
        wednesdayTest();
        thursdayTest();
        fridayTest();
        saturdayTest();
        sundayTest();
        invalidNumberTest();
    }

    static void mondayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(1);
        check(result.equals("Monday"), "Monday Test");
    }

    static void tuesdayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(2);
        check(result.equals("Tuesday"), "Tuesday Test");
    }

    static void wednesdayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(3);
        check(result.equals("Wednesday"), "Wednesday Test");
    }

    static void thursdayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(4);
        check(result.equals("Thursday"), "Thursday Test");
    }

    static void fridayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(5);
        check(result.equals("Friday"), "Friday Test");
    }

    static void saturdayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(6);
        check(result.equals("Saturday"), "Saturday Test");
    }

    static void sundayTest() {
        DayOfTheWeekSwitchVersion subject = new DayOfTheWeekSwitchVersion();
        String result = subject.detectDayName(7);
        check(result.equals("Sunday"), "Sunday Test");
    }

    static void invalidNumberTest() {
        DayOfTheWeekArrayVersion subject = new DayOfTheWeekArrayVersion();
        String result = subject.detectDayName(8);
        check(result.equals("Please input a valid number between 1 and 7"), "Invalid Number");
    }


    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
