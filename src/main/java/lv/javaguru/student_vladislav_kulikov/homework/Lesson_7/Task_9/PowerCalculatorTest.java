package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_9;

class PowerCalculatorTest {

    public static void main(String[] args) {
        gettingAnswerTest();
        resultOfExponentiationTest();
    }

    static void gettingAnswerTest() {
        PowerCalculator subject = new PowerCalculator();
        double actualResult = subject.gettingAnswer(3, 3);
        check(actualResult == 27, "Getting Answer Test");
    }

    static void resultOfExponentiationTest() {
        PowerCalculator subject = new PowerCalculator();
        double actualResult = subject.gettingAnswer(5, 5);
        check(actualResult == 3125, "Result Of Exponentiation Test");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
