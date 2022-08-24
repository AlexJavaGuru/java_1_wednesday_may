package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_20_to_28;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        Random random = new Random();
        return new Circle("Circle", random.nextDouble(10));
    }

    Square createRandomSquare() {
        Random random = new Random();
        return new Square("Square", random.nextDouble(10));
    }

    Rectangle createRandomRectangle() {
        Random random = new Random();
        return new Rectangle("Rectangle", random.nextDouble(10), random.nextDouble(10));
    }

    Triangle createRandomTriangle() {
        Random random = new Random();
        return new Triangle("Triangle", random.nextDouble(10), random.nextDouble(10));
    }


    Shape createRandomShape() {
        Random rnd = new Random();
        int randomNumber = rnd.nextInt(4);
        if (randomNumber == 0) {
            return createRandomCircle();
        } else if (randomNumber == 1) {
            return createRandomSquare();
        } else if (randomNumber == 2) {
            return createRandomRectangle();
        } else {
            return createRandomTriangle();
        }
    }


    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }

    double calculateArea(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculateArea();
        }
        return result;
    }

    double calculatePerimeter(Shape[] shapes) {
        double result = 0;
        for (Shape shape : shapes) {
            result += shape.calculatePerimeter();
        }
        return result;
    }

}
