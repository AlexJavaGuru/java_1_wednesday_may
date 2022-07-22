package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_29;

import main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_29.Cat;

class CatDemo {

    public static void main(String[] args) {
        Cat kot = new Cat("Keks",2190,true);
        String nameCat = kot.getNameOfCat();
        System.out.println("Name of Cat :" + nameCat);

        kot.voice();
        kot.eat();
        Boolean HungryIsCat = kot.getIsHungry();
        System.out.println(HungryIsCat);
        kot.sleep();
        kot.voice();
        System.out.println(HungryIsCat);

    }
}
