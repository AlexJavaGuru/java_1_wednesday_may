package lv.javaguru.student_rodions_pismennijs.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.checkNumberIsEven();
    }

    private void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    NumberUtils numberUtils = new NumberUtils();

    public void checkNumberIsEven() {
        check(numberUtils.isEven(24), "Even test");
    }
}
