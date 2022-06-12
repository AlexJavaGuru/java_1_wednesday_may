package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

import java.util.Scanner;

 class Product {
    String product;
    double regularPrice;
    double discount;

     Product(String product){
        this.product = product;
        this.discount = discount;

    }
    void setRegularPrice(double price){
        this.regularPrice = price;
    }
    void setDiscount(double discount){
        this.discount = discount;
    }
    double actualPrice() {
        return regularPrice - regularPrice / 100 * discount;
    }
    void productInfo(){
        System.out.println(product +" " + "costs" + " " + actualPrice() + " " + "with the discount of" + " " + discount);
        Scanner scanner = new Scanner(System.in);
       double actualPrice = scanner.nextDouble();
    }

    }


