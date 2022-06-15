package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task30;

class Circle {

    double radius;

    Circle(double radius) {

        this.radius = radius;

    }

    void calculateArea() {
        System.out.println("Area is = " + (Math.PI * radius * radius));
//консоль не отображает русский язык, подскажите как исправить это, хотел попробовать написать на русском.

    }

}