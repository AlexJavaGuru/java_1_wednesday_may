package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_4_5;

class TriangleTest {

    public static void main(String[] args) {
        TriangleTest runner = new TriangleTest();
        runner.calculateAreaTest();
        runner.calculatePerimeterTest();
    }

    public void calculateAreaTest() {
        Triangle subject = new Triangle("Triangle", 5);
        double realResult = subject.calculateArea();
        double expectedResult = 10.825317547305481;
        check(realResult == expectedResult, "Calculate Area Test");
    }

    public void calculatePerimeterTest() {
        Triangle subject = new Triangle("Triangle", 5);
        double realResult = subject.calculatePerimeter();
        double expectedResult = 15;
        check(expectedResult == realResult, "Calculate Perimeter Test");
    }

    public void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " = OK!");
        } else {
            System.out.println(testName + " = FAIL!");
        }
    }

}
