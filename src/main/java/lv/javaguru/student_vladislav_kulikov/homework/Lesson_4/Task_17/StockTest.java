package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_4.Task_17;

class StockTest {

    final Stock subject = new Stock("Sparq", 10);

    public static void main(String[] args) {

        StockTest stock = new StockTest();
        stock.stockTestOne();
        stock.stockTestTwo();
        stock.stockTestThree();
        stock.stockTestFour();
        stock.stockTestFive();
    }

    void stockTestOne() {
        subject.updatePrice(999);
        int info = subject.getPriceInformation();
        check(info == 999, "Biggest number in period Test One");
    }


    void stockTestTwo() {
        subject.updatePrice(999);
        subject.updatePrice(1);
        int info = subject.getPriceInformation();
        check(info == 999, "Biggest number in period Test Two");
    }

    void stockTestThree() {
        subject.updatePrice(999);
        subject.updatePrice(2);
        subject.updatePrice(1000);
        int info = subject.getPriceInformation();
        check(info == 1000, "Biggest number in period Test Three");
    }

    void stockTestFour() {
        subject.updatePrice(999);
        subject.updatePrice(2);
        subject.updatePrice(1000);
        subject.updatePrice(8);
        int info = subject.getPriceInformation();
        check(info == 1000, "Biggest number in period Test Four");
    }

    void stockTestFive() {
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
