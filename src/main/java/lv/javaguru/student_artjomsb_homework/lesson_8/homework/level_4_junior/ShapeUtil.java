package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_4_junior;


import java.util.Random;

class ShapeUtil {
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

    double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    double calculateTotalPerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    Rectangle createRandomRectangle() {
        return new Rectangle("rectangle", Math.random() * 100, Math.random() * 100);
    }

    Circle createRandomCircle() {
        return new Circle(Math.random() * 100, "random circle");
    }

    Square createRandomSquare() {
        return new Square("square", Math.random() * 100);
    }

    Triangle createRandomTriangle() {
        return new Triangle("triangle", Math.random() * 100);
    }
}
