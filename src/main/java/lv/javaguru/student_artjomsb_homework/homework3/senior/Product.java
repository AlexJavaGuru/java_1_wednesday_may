package main.java.lv.javaguru.student_artjomsb_homework.homework3.senior;


class Product {
    String productName;
    double regularPrice;
    double discount;

    Product(String productName, double regularPrice, double discount) {
        this.productName = productName;
        this.discount = discount;
        this.regularPrice = regularPrice;
    }
    void setRegularPrice(double price){
        this.regularPrice = price;
    }
    void setDiscount(double discount){
        this.discount = discount;
    }
    double actualPrice() {
        return regularPrice - regularPrice * discount / 100;
    }

    void productInfo() {
        System.out.println("Product - " + productName);
        System.out.println("Price - " + regularPrice);
        System.out.println("Discount - " + discount);
    }
}
