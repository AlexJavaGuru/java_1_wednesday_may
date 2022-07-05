package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_31;

public class Product {

    String name;
    double regularPrice;
    int discount;


    public Product(String name) {
        this.name = name;
    }

    public double actualPrice(){
        double result = (regularPrice * discount) / 100;
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

    public void setDiscount (int discount){
        this.discount = discount;
    }

    public int getDiscount(){
        return discount;

    }

    void printInformation(){
        System.out.println("Name of product is: " + name);
        System.out.println("Regular price is: " + regularPrice);
        System.out.println("Discount is: " + discount);
        System.out.println("Today actual price is: " + actualPrice());


    }





}
