package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task29;

class BirdDemo {

    public static void main(String[] args) {

        Bird kesha = new Bird("Kesha",7,false);

        kesha.voice();
        kesha.hunger();
        kesha.action();

        System.out.println("Name : " + kesha.name);
        System.out.println("Age : " + kesha.age);
        System.out.println("Is hungry : " + kesha.isHungry);

    }

}