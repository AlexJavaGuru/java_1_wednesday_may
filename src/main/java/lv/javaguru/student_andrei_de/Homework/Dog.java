package main.java.lv.javaguru.student_andrei_de.Homework;

public class Dog {
    private String name;
    private int age;
    private String color;
    public void voice(){
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println(age);
        System.out.println(color);
    }

    public void happyBirthday() {
        this.age++;
    }
    void changeColor(String newColor) {
        this.color = newColor;
    }
    Dog(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.color = colour;

    }
}

