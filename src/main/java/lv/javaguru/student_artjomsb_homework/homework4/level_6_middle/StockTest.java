package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_6_middle;

class StockTest {


    public static void main(String[] args) {
        StockTest runner = new StockTest();
        runner.testMaxPrice();
        runner.testMinPrice();
        runner.testCurrentPrice();
    }

    void testCurrentPrice() {
        Stock testCurrentStock = new Stock("Test", 5);
        int expectedResult = 5;
        int result = testCurrentStock.currentPrice;
        check(result == expectedResult, "Test current Price");
        testCurrentStock.setCurrentPrice(532);
        expectedResult = 532;
        result = testCurrentStock.currentPrice;
        check(result == expectedResult, "Test current Price, number Two");
    }

    void testMaxPrice() {
        Stock testMaxStock = new Stock("Test", 10);
        int expectedResult = 999;
        testMaxStock.setCurrentPrice(999);
        int result = Integer.parseInt(testMaxStock.getPriceInformation().replaceAll(".*\s(?=.*$)", ""));
        check(result == expectedResult, "Test max Price");
        testMaxStock.setCurrentPrice(1);
        result = Integer.parseInt(testMaxStock.getPriceInformation().replaceAll(".*\s(?=.*$)", ""));
        check(result == expectedResult, "Test max Price,number Two");
        testMaxStock.setCurrentPrice(1000);
        expectedResult = 1000;
        result = Integer.parseInt(testMaxStock.getPriceInformation().replaceAll(".*\s(?=.*$)", ""));
        check(result == expectedResult, "Test max Price,number Three");
        testMaxStock.setCurrentPrice(2);
        testMaxStock.setCurrentPrice(999);
        testMaxStock.setCurrentPrice(943);
        result = Integer.parseInt(testMaxStock.getPriceInformation().replaceAll(".*\s(?=.*$)", ""));
        check(result == expectedResult, "Test max Price,number Four");
    }

    void testMinPrice() {
        Stock testMinStock = new Stock("Test", 10);
        int expectedResult = 10;
        testMinStock.setCurrentPrice(20);
        String[] priceInformation = testMinStock.getPriceInformation().split(" ", 14);
        int result = Integer.parseInt(priceInformation[10]);
        check(result == expectedResult, "Test min Price");
        testMinStock.setCurrentPrice(2);
        testMinStock.setCurrentPrice(333);
        expectedResult = 2;
        priceInformation = testMinStock.getPriceInformation().split(" ", 14);
        result = Integer.parseInt(priceInformation[10]);
        check(result == expectedResult, "Test min Price,number Two");
        testMinStock.setCurrentPrice(5032);
        testMinStock.setCurrentPrice(23);
        testMinStock.setCurrentPrice(1);
        testMinStock.setCurrentPrice(243);
        testMinStock.setCurrentPrice(4743);
        expectedResult = 1;
        priceInformation = testMinStock.getPriceInformation().split(" ", 14);
        result = Integer.parseInt(priceInformation[10]);
        check(result == expectedResult, "Test min Price,number Three");
    }

    void check(boolean isPassed, String testName) {
        if (isPassed) System.out.println("Test - " + testName + " , Passed!");
        else System.out.println("Test - " + testName + " , FAILED");
    }
}
