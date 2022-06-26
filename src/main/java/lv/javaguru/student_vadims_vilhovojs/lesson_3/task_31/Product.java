package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_31;


class Product {
    String productName;
    double regularPrice;
    double discount;

    public Product(String milk, double regularPrice, double discount) {
        this.productName = milk;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }
    void printInformation(){
        System.out.println(productName = productName);
        System.out.println("Today actual price of the milk is " + (regularPrice - ((regularPrice / 100) * discount) ));
    }
}
