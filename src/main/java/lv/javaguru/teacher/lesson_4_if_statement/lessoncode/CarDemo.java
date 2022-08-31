package lv.javaguru.teacher.lesson_4_if_statement.lessoncode;

public class CarDemo {

    public static void main(String[] args) {

        Car sportage = new Car("KIA", "White", 200);
        sportage.turnEngineOn();
        sportage.turnEngineOn();
        sportage.speedUp();
        sportage.speedUp();
        sportage.speedUp();

        System.out.println(sportage.getCurrentSpeed());

        sportage.turnEngineOff();
    }
}
