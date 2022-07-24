package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_4;

import main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_4.Car;

class CarDemo {

    public static void main(String[] args) {
        Car myCar = new Car("Nissan");
        String carModel = myCar.getModel();
        System.out.println("Car model = " + carModel);
    }
}

