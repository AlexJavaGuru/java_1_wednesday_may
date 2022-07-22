package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name) {
        this.name = name;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double actualPrice() {
        return this.regularPrice - (this.regularPrice / 100 * this.discount);
    }

    public void printInformation() {
        System.out.println(name + " with price: " + regularPrice + "$ and " + discount + "% discount now is ONLY " + actualPrice() + "$!!!");
    }
}
