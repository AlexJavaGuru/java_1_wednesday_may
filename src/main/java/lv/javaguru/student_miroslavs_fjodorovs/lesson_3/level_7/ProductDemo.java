package lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_7;

class ProductDemo {

    public static void main(String[] args) {

        Product chips = new Product("Pringles");

        chips.regularPrice = 2.50;
        chips.discount = 30;

        chips.printInformation();

    }
}
