package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_29.FirstObject;

class PhoneDemo {
    public static void main (String [] args){
        Phone Samsung = new Phone("Samsung",40,"black");
        Samsung.turnOn();
        Samsung.charge();
        Samsung.setBattery(Samsung.battery+5);
        Samsung.charge();


    }
}
