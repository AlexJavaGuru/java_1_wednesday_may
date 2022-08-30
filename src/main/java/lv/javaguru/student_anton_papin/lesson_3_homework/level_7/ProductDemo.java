package lv.javaguru.student_anton_papin.lesson_3_homework.level_7;

class ProductDemo {
    public static void main(String[] args) {
        Product anyProduct = new Product("Milk");
        anyProduct.setRegularPrice(2.5);
        anyProduct.setDiscount(15.5);
        anyProduct.actualPrice();
        anyProduct.productInfo();
    }
}

