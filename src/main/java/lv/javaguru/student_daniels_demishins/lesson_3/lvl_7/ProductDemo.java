package main.java.lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class ProductDemo {
    public static void main(String[] args) {
        Product product=new Product("Beer",1.8, 0.3);
        product.printInformation();
        product.doubleActualPrice();
        System.out.println("The beer`s actual price is 1.5");
    }
}
