package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogFive {

    String name;
    int age;
    String color;

    DogFive(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println(name + color + age);
    }

    void changeColor(String newColor) {
        color = newColor;
    }
}

