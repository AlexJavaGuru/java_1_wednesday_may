package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_31;

public class Product {

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

    double actualPrice() {

        return (this.discount > 0) ?
                    this.regularPrice - (this.regularPrice * this.discount) / 100 :
                    this.regularPrice;
    }

    void printInformation() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("This product name " + this.name + ", price  %.2f", actualPrice() ) ;
    }
}
