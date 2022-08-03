package main.java.lv.javaguru.teacher.lesson_8_inheritance.lessoncode;

public class Demo {

    public static void main(String[] args) {

        SmartPhone samsungS20 = new Samsung("S20", true, "Android", 100, 4096);
        SmartPhone applePhone = new ApplePhone("X10", true, "iOS", 100, 4096);
        samsungS20.sendSMS("Hello from Samsung");
        samsungS20.makeCalls("6264623462");

        System.out.println(samsungS20);

        WirelessCharger wirelessCharger = new WirelessCharger();

        wirelessCharger.charge(samsungS20);
        wirelessCharger.charge(applePhone);

        SmartPhone[] smartPhones = new SmartPhone[2];
        smartPhones[0] = samsungS20;
        smartPhones[1] = applePhone;

        for (SmartPhone smartPhone : smartPhones) {
            smartPhone.transferData("Funny picture...");
        }
    }
}
