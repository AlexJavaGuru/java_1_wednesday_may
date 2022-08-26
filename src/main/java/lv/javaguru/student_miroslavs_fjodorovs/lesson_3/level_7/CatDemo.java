package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_7;

class CatDemo {

    public static void main(String[] args) {

        Cat arya = new Cat("Arya", 3, true );

        System.out.println("Name : " + arya.name);
        System.out.println("Age : " + arya.age);
        System.out.println("Is hungry : " + arya.isHungry);

        arya.meow();
        arya.eat();
        System.out.println("Is not hungry : " + arya.isHungry);
        arya.sleep();
    }
}
