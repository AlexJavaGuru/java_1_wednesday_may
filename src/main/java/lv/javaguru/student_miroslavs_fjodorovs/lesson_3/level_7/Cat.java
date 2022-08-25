package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_7;

class Cat {

    String name;
    int age;
    boolean isHungry;

    public Cat(String name, int age, boolean isHungry){
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;
    }

    void meow(){
        System.out.println("Meow... ");
    }

    void eat(){
        System.out.println(this.name + " is eating..." );
    }

    void sleep(){
        System.out.println(this.name + " is sleeping...");
    }

}
