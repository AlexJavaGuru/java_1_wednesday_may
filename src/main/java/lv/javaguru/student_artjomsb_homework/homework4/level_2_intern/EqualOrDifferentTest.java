package lv.javaguru.student_artjomsb_homework.homework4.level_2_intern;

public class EqualOrDifferentTest {


    public static void main(String[] args) {
        EqualOrDifferentTest runner = new EqualOrDifferentTest();
        runner.differentNumbers(10, 21);
        runner.equalNumbers(10, 10);
    }

    void differentNumbers(int numberOne, int numberTwo) {
        EqualOrDifferent victim = new EqualOrDifferent();
        check(!victim.isEqual(numberOne, numberTwo), "Test the number are different");
    }

    void equalNumbers(int numberOne, int numberTwo) {
        EqualOrDifferent victim = new EqualOrDifferent();
        check(victim.isEqual(numberOne, numberTwo), "Test the number are equal");
    }

    void check(boolean statement, String testName) {
        if (statement) {
            System.out.println("Test - " + testName + " , Passed!");
        } else {
            System.out.println("Test - " + testName + " , FAILED");
        }
    }
}
