package lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_31;

public class ProductDemo {

    public static void main(String[] args) {
        Product product = new Product("milk");
        product.setRegularPrice(1.25);
        product.setDiscount(20.5);
        product.printInformation();
    }

}
