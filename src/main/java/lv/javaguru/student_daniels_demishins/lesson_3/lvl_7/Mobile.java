package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class Mobile {
    String brand;
    double weight;
    String color;

    Mobile(String brand, double weight, String color) {
        this.brand = brand;
        this.weight = weight;
        this.color = color;
    }
    void light(){
        System.out.println("Is unlocked...");
    }
    String getBrand(){
        return this.brand;
    }
    double getWeight(){
        return this.weight;
    }
    String getColor(){
        return this.color;
    }
    void locked(){
        System.out.println("Locking....");
    }
}
