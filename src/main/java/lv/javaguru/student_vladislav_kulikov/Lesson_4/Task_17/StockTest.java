package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_17;

class StockTest {

    public static void main(String[] args) {

        StockTest stock = new StockTest();
        stock.stockTestOne();
        stock.stockTestTwo();
        stock.stockTestThree();
        stock.stockTestFour();
        stock.stockTestFive();
    }

    void stockTestOne() {
        Stock subject = new Stock("Company 1", 0);
        subject.updatePrice(999);
        int info = subject.getPriceInformation();
        check(info == 999, "Biggest number in period Test One");
    }


    void stockTestTwo() {
        Stock subject = new Stock("Company 2", 0);
        subject.updatePrice(999);
        subject.updatePrice(1);
        int info = subject.getPriceInformation();
        check(info == 999, "Biggest number in period Test Two");
    }

    void stockTestThree() {
        Stock subject = new Stock("Company 3", 0);
        subject.updatePrice(999);
        subject.updatePrice(2);
        subject.updatePrice(1000);
        int info = subject.getPriceInformation();
        check(info == 1000, "Biggest number in period Test Three");
    }

    void stockTestFour() {
        Stock subject = new Stock("Company 4", 0);
        subject.updatePrice(999);
        subject.updatePrice(2);
        subject.updatePrice(1000);
        subject.updatePrice(8);
        int info = subject.getPriceInformation();
        check(info == 1000, "Biggest number in period Test Four");
    }

    void stockTestFive() {
        Stock subject = new Stock("Company 5", 0);
        subject.updatePrice(9);
        subject.updatePrice(27);
        int info = subject.getPriceInformation();
        check(info == 27, "Biggest number in period Test Five");
    }

    void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
