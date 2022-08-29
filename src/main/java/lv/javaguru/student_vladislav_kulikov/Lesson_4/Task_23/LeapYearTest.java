package lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_23;

public class LeapYearTest {

    public static void main(String[] args) {

        LeapYearTest leapYearTest = new LeapYearTest();
        leapYearTest.regularYearOrNotTestOne();
        leapYearTest.regularYearOrNotTestTwo();
        leapYearTest.regularYearOrNotTestThree();
        leapYearTest.regularYearOrNotFour();
    }

    void regularYearOrNotTestOne(){
        LeapYear leapYear = new LeapYear();
         int year = 3;
         boolean expectedResult = false;
         boolean actualResult = leapYear.isLeapYear(year);
         check(expectedResult, actualResult, "Year 1");
    }

    void regularYearOrNotTestTwo(){
        LeapYear leapYear = new LeapYear();
        int year = 60;
        boolean expectedResult = true;
        boolean actualResult = leapYear.isLeapYear(year);
        check(expectedResult, actualResult, "Year 2");
    }

    void regularYearOrNotTestThree(){
        LeapYear leapYear = new LeapYear();
        int year = 400;
        boolean expectedResult = true;
        boolean actualResult = leapYear.isLeapYear(year);
        check(expectedResult, actualResult, "Year 3");
    }

    void regularYearOrNotFour(){
        LeapYear leapYear = new LeapYear();
        int year = 600;
        boolean expectedResult = false;
        boolean actualResult = leapYear.isLeapYear(year);
        check(expectedResult, actualResult, "Year 4");
    }

    void check(boolean expectedResult, boolean actualResult, String taskName){
        if (expectedResult == actualResult){
            System.out.println(taskName + " = OK");
        }else{
            System.out.println(taskName + " = FAILED");
        }
    }
}
