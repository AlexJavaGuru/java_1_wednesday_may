package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_2.task_7;

class DayOfTheWeekDetectorTest {

    public static void main(String[] args) {
        DayOfTheWeekDetectorTest runner = new DayOfTheWeekDetectorTest();
        runner.isDayMondey();
        runner.isDayTuesday();
        runner.isDayThursday();
        runner.isDayFriday();
        runner.isDaySaturday();
        runner.isDaySunday();
        runner.isDayNotCorrect();

    }

    public void isDayMondey(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Monday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(1);
        chek(expectedResult, actualResult,"Monday ");

    }
    public void isDayTuesday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Tuesday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(2);
        chek(expectedResult, actualResult,"Tuesday ");

    }
    public void isDayWednesday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Wednesday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(3);
        chek(expectedResult, actualResult,"Wednesday ");

    }
    public void isDayThursday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Thursday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(4);
        chek(expectedResult, actualResult,"Thursday ");

    }
    public void isDayFriday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Friday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(5);
        chek(expectedResult, actualResult,"Friday ");

    }
    public void isDaySaturday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Saturday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(6);
        chek(expectedResult, actualResult,"Saturday ");

    }
    public void isDaySunday(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Sunday";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(7);
        chek(expectedResult, actualResult,"Sunday ");

    }
    public void isDayNotCorrect(){
        DayOfTheWeekDetector dayOfTheWeekDetector = new DayOfTheWeekDetector();
        String expectedResult = "Not correct day number";
        String actualResult = dayOfTheWeekDetector.findDayOfTheWeek(9);
        chek(expectedResult, actualResult,"Not correct day  ");

    }

    private void chek(String expectedResult, String actualResult,String nameTest) {
        if(actualResult == expectedResult){
            System.out.println(nameTest + "test has Passed.OK!");
        }else{
            System.out.println(nameTest + "test has FAILED!!!!!!");
        }
    }


}
