package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task29;

class Bird {

    String name;
    int age;
    boolean isHungry;

    Bird(String name,int age,boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;

    }

    void voice() {
        System.out.println("Chirik Chirik");

    }

    void hunger() {
        System.out.println("Eating");

    }

    void action() {
        System.out.println("Flying");

    }

}