package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task29;

class CarDemo {

    public static void main(String[] args) {

        Car bmw = new Car("X5",250,2022);

        bmw.gas();
        bmw.brake();

        System.out.println("Model : " + bmw.model);
        System.out.println("Max speed : " + bmw.maxSpeed);
        System.out.println("Year : " + bmw.yearOfManufacture);

    }

}