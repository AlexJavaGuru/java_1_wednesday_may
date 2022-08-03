package main.java.lv.javaguru.teacher.lesson_8_inheritance.lessoncode;

public class Samsung extends SmartPhone {

    public Samsung(String model, boolean networkAvailability, String os, int batteryCharge, int memorySize) {
        super(model, networkAvailability, os, batteryCharge, memorySize);
    }

    @Override
    void transferData(String data) {
        System.out.println("Transferring data with BlueTooth");
    }


    @Override
    public String toString() {
        return "Samsung{" +
                "model='" + model + '\'' +
                ", networkAvailability=" + networkAvailability +
                ", os='" + os + '\'' +
                ", batteryCharge=" + batteryCharge +
                ", memorySize=" + memorySize +
                '}';
    }
}
