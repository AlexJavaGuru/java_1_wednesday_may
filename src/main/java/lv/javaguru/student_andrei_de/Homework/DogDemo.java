package main.java.lv.javaguru.student_andrei_de.Homework;

public class DogDemo {
    public static void main(String[] args) {

        Dog tom = new Dog("Tom", 5, "Black");
        tom.voice();
        tom.happyBirthday();
        tom.changeColor("Orange");
        tom.voice();

    }
}
