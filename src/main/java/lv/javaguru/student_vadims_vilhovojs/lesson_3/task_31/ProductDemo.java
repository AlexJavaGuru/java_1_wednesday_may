package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product();
        double productActualPrice = product.actualPrice("Product" ,70.0,30.0);

        product.printInformation(productActualPrice);


    }
}
