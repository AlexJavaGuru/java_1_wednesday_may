package lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_6;



class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.updatePriceTest();
    }

    void updatePriceTest() {

        //10 -> 12 -> 5 -> 7 -> 99 -> 77

        Stock stock = new Stock("Tesla" ,10.0);
        stock.updatePrice(12.0);
        double expectedResult = 12.0;
        double actualResult = stock.getMaxPrice();
        this.check(expectedResult, actualResult,"test update Price");

        stock.updatePrice(5.0);
        expectedResult = 5.0;
        actualResult = stock.getMinPrice();

        this.check(expectedResult, actualResult,"test update Price");

        expectedResult = 12.0;
        actualResult = stock.getMaxPrice();

        this.check(expectedResult, actualResult,"test update Price");

        stock.updatePrice(7.0);
        expectedResult = 5.0;
        actualResult = stock.getMinPrice();

        this.check(expectedResult, actualResult,"test update Price");

        expectedResult = 12.0;
        actualResult = stock.getMaxPrice();

        this.check(expectedResult, actualResult,"test update Price");

        stock.updatePrice(99.0);
        expectedResult = 99.0;
        actualResult = stock.getMaxPrice();

        this.check(expectedResult, actualResult,"test update Price");

        expectedResult = 5.0;
        actualResult = stock.getMinPrice();

        this.check(expectedResult, actualResult,"test update Price");

        stock.updatePrice(77.0);
        expectedResult = 99.0;
        actualResult = stock.getMaxPrice();

        this.check(expectedResult, actualResult,"test update Price");

        expectedResult = 5.0;
        actualResult = stock.getMinPrice();

        this.check(expectedResult, actualResult,"test update Price");
    }


    public void check(double expectedResult, double actualResult, String testName) {
        if (expectedResult == actualResult) {
            System.out.println(testName + " has passed.");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected: " + expectedResult + " but actual is: " + actualResult);
        }
    }
}
