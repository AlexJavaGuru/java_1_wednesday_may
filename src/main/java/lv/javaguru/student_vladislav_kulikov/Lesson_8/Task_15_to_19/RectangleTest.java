package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class RectangleTest {

    public static void main(String[] args) {
        calculateArea();
        calculatePerimeter();

    }

    static void calculateArea() {
        Rectangle rectangle = new Rectangle(2, 4, "Area");
        double result = rectangle.calculateArea();
        check(result == 8.0, "Find Area");
    }

    static void calculatePerimeter() {
        Rectangle rectangle = new Rectangle(2, 4, "Perimeter");
        double result = rectangle.calculatePerimeter();
        check(result == 12.0, "Find Perimeter");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}