package lv.javaguru.teacher.lesson_3_oop_first_look.lessoncode;

public class DogDemo {

    public static void main(String[] args) {

        Dog sharik = new Dog("Sharik", 2, false);
        Dog bobik = new Dog("Bobik", 10, true);

        sharik.bark();
        sharik.bark();
        System.out.println("Name: " + sharik.name);
        System.out.println("Age: " + sharik.age);
        System.out.println("Is hungry: " + sharik.isHungry);

        sharik.isHungry = true;
        System.out.println("Is hungry: " + sharik.isHungry);

        sharik.eat();
        System.out.println("Is hungry: " + sharik.isHungry);
//
//        System.out.println("Name: " + bobik.name);
//        System.out.println("Age: " + bobik.age);
//        System.out.println("Is hungry: " + bobik.isHungry);
    }

}
