package lv.javaguru.student_artjomsb_homework.homework3.senior;

class ProductDemo {
    public static void main(String[] args) {
        Product itemOne = new Product("phone", 0, 0);
        itemOne.productInfo();
        double discount = 53;
        double price = 3.57;
        itemOne.setRegularPrice(price);
        itemOne.setDiscount(discount);
        itemOne.productInfo();
        double priceWithDiscount = itemOne.actualPrice();
        System.out.println("Price with discount = " + priceWithDiscount);
    }
}
