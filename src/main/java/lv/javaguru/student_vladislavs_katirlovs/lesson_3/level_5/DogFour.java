package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogFour {

    String name;
    int age;
    String colour;

    DogFour(String name, int age, String colour){
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    void voice() {
        System.out.println(name + colour + age);
    }

    void happyBirthday() {
        System.out.println(name + "became older...");
        age = age + 1;
        System.out.println(name + "is now " + age + " years old");
    }
}

