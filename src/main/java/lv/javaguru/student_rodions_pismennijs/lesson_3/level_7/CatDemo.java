package main.java.lv.javaguru.student_rodions_pismennijs.lesson_3.level_7;

class CatDemo {

    public static void main(String[] args) {

        Cat pisha = new Cat("Pisha", 7, true);

        System.out.println("Name : " + pisha.name);
        System.out.println("Age : " + pisha.age);
        System.out.println("Is hungry : " + pisha.isHungry);

        pisha.meow();
        pisha.eat();
        System.out.println("Is hungry : " + pisha.isHungry);
        pisha.sleep();

    }

}
