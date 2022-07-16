package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogThree {

    String name;
    int age;

    DogThree(String name, int age){
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println(name + age);
    }

    void happyBirthday() {
        System.out.println(name + " became older...");
        age = age + 1;
        System.out.println(name + " is now " + age + " years old");
    }
}
