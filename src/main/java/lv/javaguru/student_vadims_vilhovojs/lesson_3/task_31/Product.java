package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_31;


class Product {
    String productName;
    double regularPrice;
    double discount;

    Product(String milk, double regularPrice, double discount) {
        this.productName = milk;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

    double actualPrice() {
        double price = regularPrice - ((regularPrice / 100) * discount);
        return price;


    }

    void printInformation() {
        System.out.println(actualPrice());
    }
}
