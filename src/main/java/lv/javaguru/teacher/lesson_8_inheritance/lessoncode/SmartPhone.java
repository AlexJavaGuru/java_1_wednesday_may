package lv.javaguru.teacher.lesson_8_inheritance.lessoncode;

public abstract class SmartPhone extends Phone implements SmartPhoneInterface {

    protected String model;
    protected boolean networkAvailability;
    protected String os;
    protected int batteryCharge;
    protected int memorySize;

    public SmartPhone(String model, boolean networkAvailability, String os, int batteryCharge, int memorySize) {
        this.model = model;
        this.networkAvailability = networkAvailability;
        this.os = os;
        this.batteryCharge = batteryCharge;
        this.memorySize = memorySize;
    }

    public void sendSMS(String text) {
        System.out.println("Sending message with text: " + text);
    }

    public void charge() {
        batteryCharge++;
    }

    abstract void transferData(String data);

    @Override
    public String toString() {
        return "SmartPhone{" +
                "os='" + os + '\'' +
                ", batteryCharge=" + batteryCharge +
                ", memorySize=" + memorySize +
                '}';
    }
}
