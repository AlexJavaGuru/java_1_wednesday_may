package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_29.FirstObject;

class PhoneDemo {
    public static void main (String [] args){
        Phone samsung = new Phone("Samsung",40,"black");
        samsung.turnOn();
        samsung.charge();
        samsung.setBattery(samsung.battery+5);
        samsung.charge();


    }
}
