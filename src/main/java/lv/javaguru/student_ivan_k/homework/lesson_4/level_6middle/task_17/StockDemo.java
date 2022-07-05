package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_6middle.task_17;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE",10);
        int priceInformation = google.getPriceInformation();
        String nameOfCompany = google.nameOfCompany;
        System.out.println("Market price stock of company "+ nameOfCompany + " " + priceInformation);
        google.info();
        google.updatePrice(11);
        google.info();

    }
}
