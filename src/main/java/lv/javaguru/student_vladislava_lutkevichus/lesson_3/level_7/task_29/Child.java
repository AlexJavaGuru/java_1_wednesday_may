package main.java.lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_7.task_29;

public class Child {
    String name;
    String hairColor;
    int age;

    public Child(String name, String hairColor, int age) {
        this.name = name;
        this.hairColor = hairColor;
        this.age = 3;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void childFacts() {
        System.out.println("Child name is " + name);
        System.out.println(name + " is " + age + " years old and has " + hairColor + " hair color.");
    }

    void happyBirthday() {
        age++;
    }

    void changeHairColor(String newHairColor) {
       this.hairColor = newHairColor;
    }

}
