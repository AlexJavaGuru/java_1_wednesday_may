package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_5;

class DogTwo {

    String name;
    int age;

    DogTwo(String name, int age){
        this.name = name;
        this.age = age;
    }

    void voice() {
        System.out.println(name + age);
    }
}