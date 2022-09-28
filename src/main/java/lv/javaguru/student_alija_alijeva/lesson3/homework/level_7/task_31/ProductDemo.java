package lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_31;

public class ProductDemo {
    public static void main(String[] args) {
        Product phone = new Product("Phone", 1000, 5);
        phone.printInformation();
        phone.doubleActualPrice();
    }
}
