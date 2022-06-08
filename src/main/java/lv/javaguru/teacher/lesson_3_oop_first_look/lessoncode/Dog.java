package main.java.lv.javaguru.teacher.lesson_3_oop_first_look.lessoncode;

public class Dog {

    String name; //default = null
    int age; //default = 0
    boolean isHungry; //default = false

    public Dog(String name, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    public Dog(String name) {
        this.name = name;
    }

    void bark() {
        System.out.println("Wuf");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }

    void eat() {
        System.out.println("Eating...");
        isHungry = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }
}
