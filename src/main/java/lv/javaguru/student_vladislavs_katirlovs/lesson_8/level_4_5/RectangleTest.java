package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

class RectangleTest {

    public static void main(String[] args) {
        RectangleTest runner = new RectangleTest();
        runner.CalculateAreaTest();
        runner.CalculatePerimeterTest();
    }

    public void CalculateAreaTest() {
        Rectangle subject = new Rectangle("Rectangle", 3, 5);
        double expectedResult = 15;
        double realResult = subject.calculateArea();
        check(realResult == expectedResult, "Calculate Area Test");
    }

    public void CalculatePerimeterTest() {
        Rectangle subject = new Rectangle("Rectangle", 3, 5);
        double expectedResult = 16;
        double realResult = subject.calculatePerimeter();
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
