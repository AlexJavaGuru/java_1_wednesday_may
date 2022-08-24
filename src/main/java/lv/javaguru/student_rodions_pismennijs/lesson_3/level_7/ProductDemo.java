package lv.javaguru.student_rodions_pismennijs.lesson_3.level_7;

class ProductDemo {

    public static void main(String[] args) {

        Product beer = new Product("Corona Extra");

        beer.regularPrice = 1.29;
        beer.discount = 25;

        beer.printInformation();

    }

}
