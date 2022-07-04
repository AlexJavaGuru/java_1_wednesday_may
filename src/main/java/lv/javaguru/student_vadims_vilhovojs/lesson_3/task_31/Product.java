package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_31;


class Product {
    String productName;
    double regularPrice;
    double discount;

    public double actualPrice(String milk, double regularPrice, double discount) {
        this.productName = milk;
        this.regularPrice = regularPrice;
        this.discount = discount;

        double actualPrice = regularPrice - ((regularPrice / 100) * discount);
        return actualPrice;

    }
    void printInformation(double actualPrice){
        System.out.println(actualPrice);
    }
}
