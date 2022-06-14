package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_31;

class Product {
String name;
double regularPrice;
double discount;

public Product(String name, double regularPrice, double discount){
    this.name = name;
    this.regularPrice = regularPrice;
    this.discount = discount;
}
    void doubleActualPrice(){System.out.println ("Actual price is " + (regularPrice - (regularPrice*discount/100)));}
    void printInformation(){
    System.out.println("This is a " + name);
    System.out.println("Regular price is " + regularPrice);

    }
}
