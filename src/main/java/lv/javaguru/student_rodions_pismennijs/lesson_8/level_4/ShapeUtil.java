package lv.javaguru.student_rodions_pismennijs.lesson_8.level_4;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle("Random Circle", Math.random() * 50);
    }

    Square createRandomSquare() {
        return new Square("Random Square", Math.random() * 50);
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Random Rectangle", Math.random() * 50, Math.random() * 50);
    }

    Triangle createRandomTriangle() {
        return new Triangle("Random Triangle", Math.random() * 50);
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

    double calculateArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }

    double calculatePerimeter(Shape[] shapes) {
        double perimeter = 0;
        for (Shape shape : shapes) {
            perimeter += shape.calculatePerimeter();
        }
        return perimeter;
    }

    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
