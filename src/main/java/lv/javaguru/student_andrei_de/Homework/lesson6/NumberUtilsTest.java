package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.checkNumberIsEven();
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Fail");
        }
    }

    NumberUtils numberUtils = new NumberUtils();

    public void checkNumberIsEven(){
        check(numberUtils.isEven(20), "Even Test");
    }

}
