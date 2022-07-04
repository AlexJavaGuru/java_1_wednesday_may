package main.java.lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_19;

class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void voice(){
        System.out.println(name + " " + age);
    }



}
