package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_5;

class Dog {

    String name;
    int age;
    String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println(this.name + "" + this.name + "" + this.name);
        System.out.println("My age is " + this.age + " and my color is " + this.color);
    }

    void happyBirthday(){
        System.out.println("Happy Birthday!");
        System.out.println("Now i'm " + this.age);
    }

    void changeColor(String newColor){
        this.color = newColor;
    }
}
