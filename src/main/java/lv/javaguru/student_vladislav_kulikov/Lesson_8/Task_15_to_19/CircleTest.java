package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class CircleTest {

    public static void main(String[] args) {
        calculateArea();
        calculatePerimeter();
    }

    static void calculateArea() {
        Circle circle = new Circle(15.5, "Area");
        double result = circle.calculateArea();
        check(result == 754.385, "Find Area");
    }

    static void calculatePerimeter() {
        Circle circle = new Circle(15.5, "Perimeter");
        double result = circle.calculatePerimeter();
        check(result == 97.34, "Find Perimeter");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
