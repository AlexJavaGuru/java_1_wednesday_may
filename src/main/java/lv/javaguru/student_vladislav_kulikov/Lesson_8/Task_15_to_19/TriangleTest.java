package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class TriangleTest {

    public static void main(String[] args) {
        calculateArea();
        calculatePerimeter();
    }

    static void calculateArea() {
        Triangle triangle = new Triangle(3, 0, 0, 3, "Area");
        double result = triangle.calculateArea();
        check(result == 4.5, "Find Area");
    }

    static void calculatePerimeter() {
        Triangle triangle = new Triangle(3, 3, 4, 4, "Perimeter");
        double result = triangle.calculatePerimeter();
        check(result == 10.0, "Find Perimeter");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
