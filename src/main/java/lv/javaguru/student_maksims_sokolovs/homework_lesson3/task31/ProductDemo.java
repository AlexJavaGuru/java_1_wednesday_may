package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task31;

class ProductDemo {

    public static void main (String [] args) {
        Product playstation = new Product("Playstation", 965, 17);

        playstation.printInformation();

        double result = playstation.doubleActualPrice();
        System.out.println("Discounted price is " + result);
    }

}