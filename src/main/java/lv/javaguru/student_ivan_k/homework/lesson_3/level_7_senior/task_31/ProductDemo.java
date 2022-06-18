package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_31;

public class ProductDemo {

    public static void main(String[] args) {
        Product tovar = new Product("Coca Cola");
        String nameOfTovar = tovar.getName();
        System.out.println("Selected product: "+ nameOfTovar);

        tovar.setRegularPrice(1.5);
        double priceOfTovar = tovar.getRegularPrice();
        System.out.println("Regular price is: " + priceOfTovar);
        tovar.setDiscount(0.3);
        double discountOfTovar = tovar.getDiscount();
        System.out.println("Discount is: " + discountOfTovar);
        double result = tovar.actualPrice();
        System.out.println("Today actual price on Coca Cola: " + result );

        tovar.printInformation();








    }
}
