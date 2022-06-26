package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_1_intern;

public class IsEvenTest {
    public static void main(String[] args) {
        IsEvenTest runner = new IsEvenTest();
        runner.even(428534);
        runner.odd(523);

    }

    void even(int number) {
        IsEven victim = new IsEven();
        boolean expectedResult = true;
        String expectedResultString = "Even";
        check(String.valueOf(expectedResult), String.valueOf(victim.evenOrNot(number)), "Test check that number was even");
        check(expectedResultString, victim.evenOrNotMethodTwo(number), "Test check that number was even");
    }

    void odd(int number) {
        IsEven victim = new IsEven();
        boolean expectedResult = false;
        String expectedResultString = "Odd";
        check(String.valueOf(expectedResult), String.valueOf(victim.evenOrNot(number)), "Test check that number was odd");
        check(expectedResultString, victim.evenOrNotMethodTwo(number), "Test check that number was odd");
    }

    void check(String expectedResult, String actualResult, String testName) {
        boolean isPassed = expectedResult.equals(actualResult);
        if (isPassed) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
