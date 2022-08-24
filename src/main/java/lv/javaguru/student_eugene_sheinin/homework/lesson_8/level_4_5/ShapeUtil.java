package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_4_5;

import java.util.Random;

public class ShapeUtil {

    Circle createRandomCircle(){

        return new Circle("Circle with random radius",
                new Random().nextDouble(1,10)
        );
    }

    Square createRandomSquare() {

        return new Square("Square with random side",
                new Random().nextDouble(1,10)
        );
    }

    Rectangle createRandomRectangle() {

        return new Rectangle("Rectangle with random sides",
                new Random().nextDouble(1,10),
                new Random().nextDouble(1,10)
        );
    }

    Triangle createRandomTriangle() {
        return new Triangle("Triangle with random sides",
                new Random().nextDouble(1,10),
                new Random().nextDouble(1,10),
                new Random().nextDouble(1,10)
        );
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

    double calculateArea(Shape[] shapes){
        double shapesArea = 0;
        for(Shape shape: shapes) {
            shapesArea += shape.calculateArea();
        }

        return shapesArea;
    }

    double calculatePerimeter(Shape[] shapes) {
        double shapesPerimeter = 0;
        for(Shape shape: shapes) {
            shapesPerimeter += shape.calculatePerimeter();
        }

        return shapesPerimeter;
    }


}
