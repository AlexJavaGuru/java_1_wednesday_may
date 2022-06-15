package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task31;

class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount) {

        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;

    }

    void doubleActualPrice() {

        System.out.println("Discounted price is " + (regularPrice - (regularPrice*discount/100)));

    }

    void printInformation() {

        System.out.println(name);
        System.out.println("Regular price is " + regularPrice);

    }

}