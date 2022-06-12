package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class Product {
    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount){
        this.name=name;
        this.regularPrice=regularPrice;
        this.discount=discount;
    }

    void doubleActualPrice(){
        System.out.println(regularPrice - discount);
    }
    void printInformation(){
        System.out.println("We have a "+name);
        System.out.println("Regular price of beer is "+regularPrice);
        System.out.println("The discount is about "+discount);
    }
}
