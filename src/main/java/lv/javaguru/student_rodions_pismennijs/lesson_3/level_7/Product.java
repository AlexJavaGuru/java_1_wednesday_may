package main.java.lv.javaguru.student_rodions_pismennijs.lesson_3.level_7;

class Product {

    String name;
    double regularPrice;
    double discount;

    public Product(String name){
        this.name = name;
    }

    double actualPrice() {
        return this.regularPrice - this.regularPrice / 100 * this.discount;
    }

    void printInformation(){
        System.out.println("Product : " + this.name);
        System.out.println("Regular price : " + this.regularPrice);
        System.out.println("Discount : " + this.discount);
        System.out.println("Actual price : " + actualPrice());

    }

}
