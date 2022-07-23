package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_1;

public class NumberUtilsTest {
    public static void main(String[] args) {
        NumberUtilsTest testRunner = new NumberUtilsTest();
        testRunner.testIsEven();
    }

    public void testIsEven() {
        NumberUtils testNumber = new NumberUtils();
        check(testNumber.isEven(10), "Is Even");
    }

    public void check(boolean isEven, String name) {
        if (isEven) {
            System.out.println("Test: " + name + " has passed");
        } else {
            System.out.println("Test: " + name + "has failed ");
        }
    }
}
