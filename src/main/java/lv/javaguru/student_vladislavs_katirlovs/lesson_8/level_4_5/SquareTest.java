package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

class SquareTest {

    public static void main(String[] args) {
        SquareTest runner = new SquareTest();
        runner.CalculateAreaTest();
        runner.CalculatePerimeterTest();
    }

    public void CalculateAreaTest() {
        Square subject = new Square("Square", 6);
        double realResult = subject.calculateArea();
        double expectedResult = 36;
        check(realResult == expectedResult, "Calculate Area Test");
    }

    public void CalculatePerimeterTest() {
        Square subject = new Square("Square", 6);
        double realResult = subject.calculatePerimeter();
        double expectedResult = 24;
        check(realResult == expectedResult, "Calculate Perimeter Test");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
