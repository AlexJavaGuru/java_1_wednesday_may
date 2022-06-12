package main.java.lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_18;

public class Dog {
    String name;

    public Dog(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    void voice(){
        System.out.println(name + " " + name + " " + name);
    }
}
