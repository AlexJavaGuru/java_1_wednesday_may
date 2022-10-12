package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_8.level_4_and_5;

import java.util.Random;

class ShapeUtil {

    Circle createRandomCircle() {
        return new Circle("Random circle", Math.random());
    }

    Square createRandomSquare() {
        return new Square("Random square", Math.random());
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("Random rectangle", Math.random(), Math.random());
    }

    Triangle createRandomTriangle() {
        return new Triangle("Random triangle" , Math.random());
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
