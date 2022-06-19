package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_4.Task_17;

class StockTest {

    public static void main(String[] args) {

        StockTest stock = new StockTest();
        stock.stockTest();
    }

    void stockTest() {
        String name = "Sparq";
        int cost = 10;
        Stock subject = new Stock(name, cost);
        subject.getPriceInformation();
        subject.updatePrice(10);
        subject.updatePrice(12);
        subject.updatePrice(5);
        subject.getPriceInformation();
        subject.updatePrice(7);
        subject.updatePrice(99);
        subject.updatePrice(77);
        subject.getPriceInformation();
    }
}
