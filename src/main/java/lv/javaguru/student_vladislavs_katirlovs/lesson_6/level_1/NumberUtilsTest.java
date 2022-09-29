package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_1;

class NumberUtilsTest {

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();
        test.isEvenTest();
        test.isOddTest();
    }

    public void isEvenTest() {
        int number = 8;
        boolean expectedResult = true;
        NumberUtils subject = new NumberUtils();
        boolean realResult = subject.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is even test - OK");
        } else {
            System.out.println("Is even test - FAIL");
        }
    }

    public void isOddTest() {
        int number = 3;
        boolean expectedResult = false;
        NumberUtils subject = new NumberUtils();
        boolean realResult = subject.isEven(number);
        if (realResult == expectedResult) {
            System.out.println("Is odd test - OK");
        } else {
            System.out.println("Is odd test - FAIL");
        }
    }
}
