package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task22;

class Dog {

    String newColor;

    Dog(String color) {
        this.newColor = color;

    }

    void voice() {
        System.out.println("Wuf");

    }

    void changeColor(String newColor) {
        System.out.println(newColor);

    }

    void bark() {
        System.out.println("Wuf " + this.newColor);

    }

}