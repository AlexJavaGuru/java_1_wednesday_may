package lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_7;

class ProductDemo {

    public static void main(String[] args) {

        Product laptop = new Product("ASUS");
        laptop.setRegularPrice(1999.99);
        laptop.setDiscount(25);
        laptop.printInformation();
    }
}
