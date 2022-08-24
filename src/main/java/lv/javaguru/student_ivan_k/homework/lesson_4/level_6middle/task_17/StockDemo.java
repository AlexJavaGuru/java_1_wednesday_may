package lv.javaguru.student_ivan_k.homework.lesson_4.level_6middle.task_17;

class StockDemo {

    public static void main(String[] args) {
        Stock google = new Stock("GOOGLE",10);
        String nameOfCom = google.getNameOfCompany();
        System.out.println("Company is: " + nameOfCom);
        google.getPriceInformation();
        google.updatePrice(15);
        google.updatePrice(7);
        google.getPriceInformation();
        google.updatePrice(14);
        google.getPriceInformation();
        google.updatePrice(10);
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        google.getPriceInformation();


    }
}
