package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_5.task18_19_20_21_22;

public class Dog {

    String name;
    int age;
    String color;

    Dog (String name) {
        this.name = name;
    }

    //constructor overloading for lesson 19
    Dog (String name, int age) {
        this.name = name;
        this.age = age;
    }

    //constructor overloading for lesson 21, 22
    Dog (String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {

        System.out.println(
                "Dog's name " +
                //"при выполнении этой команды на консоль должно выводиться кличка собаки три раза" for lesson 18, but for lesson 19 no such condition :))
                ((this.age > 0) ? this.name + " , age " + this.age : (this.name + " ").repeat(3)) +
                ((this.color != null) ? " , color " + this.color : " ") //conditions for lessons 21, 22);
        );

    }


    //lesson 20
    void happyBirthday() {
        // increase age
        this.age++;
    }

    //lesson 22
    void changeColor(String newColor) {
        this.color = newColor;
    }
}
