package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_29;

import java.util.concurrent.Callable;

class CarDemo {

    public static void main(String[] args) {
        Car mashina = new Car("BMW", "Black", 2009, false);
        String nameCar = mashina.getBrand();
        boolean statusEngine = mashina.isEngineOn();
        System.out.println("Brand of car is : " + nameCar);
        System.out.println(" Engine is  : " + statusEngine);
        mashina.startedEngine();
        System.out.println(" Engine is  : " + statusEngine);

    }
}
