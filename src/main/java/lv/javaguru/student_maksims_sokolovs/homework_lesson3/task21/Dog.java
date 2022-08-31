package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task21;

class Dog {

    String name;
    int age;
    String color;

    Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    void voice() {
        System.out.println("Name " + name);
        System.out.println("Age " + age);
        System.out.println("Color " + color);

    }

}