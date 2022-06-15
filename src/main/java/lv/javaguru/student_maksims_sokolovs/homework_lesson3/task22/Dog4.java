package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task22;

class Dog4 {

    String newColor;

    Dog4(String color) {
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