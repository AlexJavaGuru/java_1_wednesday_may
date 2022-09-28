package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task29;

class Car {

    String model;
    int maxSpeed;
    int yearOfManufacture;

    Car(String model,int maxSpeed,int yearOfManufacture) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfManufacture = yearOfManufacture;

    }

    void gas() {
        System.out.println("Gas: Vzhhhh");

    }

    void brake() {
        System.out.println("Brake: Brrrr");

    }

}