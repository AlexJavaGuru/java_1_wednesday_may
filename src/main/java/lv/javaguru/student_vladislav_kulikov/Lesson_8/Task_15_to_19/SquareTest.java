package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_15_to_19;

class SquareTest {

    public static void main(String[] args) {
        calculateArea();
        calculatePerimeter();
    }

    static void calculateArea() {
        Square square = new Square(2.0, "Area");
        double result = square.calculateArea();
        check(result == 4.0, "Find Area");
    }

    static void calculatePerimeter() {
        Square square = new Square(2.0, "Perimeter");
        double result = square.calculatePerimeter();
        check(result == 8.0, "Find Perimeter");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
