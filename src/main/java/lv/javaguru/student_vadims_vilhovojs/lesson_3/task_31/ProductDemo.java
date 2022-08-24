package lv.javaguru.student_vadims_vilhovojs.lesson_3.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product product = new Product("Product", 70, 30);
        double actualPrice = product.actualPrice();

        product.printInformation();


    }
}
