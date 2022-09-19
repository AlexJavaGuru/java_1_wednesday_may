package lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_6;

class NumberUtilsTest {

    final NumberUtils subject = new NumberUtils();

    public static void main(String[] args) {
        NumberUtilsTest test = new NumberUtilsTest();

        test.isEvenTest();
        test.isOddTest();

    }

    void isEvenTest(){
        boolean result = subject.isEven(2);
        check(result, "Is number even");
    }

    void isOddTest(){
        boolean result = subject.isEven(3);
        check(!result, "Is number odd");
    }

    void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
