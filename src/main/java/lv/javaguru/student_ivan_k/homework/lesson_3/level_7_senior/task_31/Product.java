package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_31;

public class Product {

    String name;
    double regularPrice;
    double discount;
    double result;


    public Product(String name) {
        this.name = name;
    }

    public double actualPrice(){
        double result = regularPrice - discount;
        return result;

    }

    public String getName() {
        return name;
    }
    public double getRegularPrice(){
        return regularPrice;
    }
    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice;
    }

    public void setDiscount (double discount){
        this.discount = discount;
    }

    public double getDiscount(){
        return discount;

    }

    void printInformation(){
        System.out.println("Regular price is: " + regularPrice);
        System.out.println("Discount is: " + discount);
        System.out.println("Today actual price on Coca Cola: " + result );


    }





}
