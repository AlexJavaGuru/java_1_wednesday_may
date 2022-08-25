package lv.javaguru.student_ivan_k.homework.lesson_4.level_6middle.task_17;

class StockTest {
    public static void main(String[] args) {
        StockTest runnerTest = new StockTest();
        runnerTest.testMaxPricePerPeriod();
        System.out.println();
        runnerTest.testSecMaxPricePerPeriod();
        System.out.println();
        runnerTest.testThirdMaxPricePerPeriod();
        System.out.println();
        runnerTest.testForMaxPricePerPeriod();
        System.out.println();
        runnerTest.testMinPricePerPeriod();


    }

    void testMaxPricePerPeriod (){
        Stock subject = new Stock("S",11);
        int newPrice = 999;
        int expectedResult = 999;
        subject.updatePrice(newPrice);
        int actualResult = subject.getMaximalPrice();
        chek(actualResult,expectedResult,"MaximalPrice test");
    }
    void testSecMaxPricePerPeriod (){
        Stock subjrct = new Stock ("S",11);
        int newPrice1 = 999;
        int newPrice2 = 1;
        int expectedResult = 999;
        subjrct.updatePrice(newPrice1);
        subjrct.updatePrice(newPrice2);
        int actualResult = subjrct.getMaximalPrice();
        chek(actualResult,expectedResult,"SecMax test");
    }
    void testThirdMaxPricePerPeriod (){
        Stock subjrct = new Stock ("S",11);
        int newPrice1 = 999;
        int newPrice2 = 2;
        int newPrice3 = 1000;
        int expectedResult = 1000;
        subjrct.updatePrice(newPrice1);
        subjrct.updatePrice(newPrice2);
        subjrct.updatePrice(newPrice3);
        int actualResult = subjrct.getMaximalPrice();
        chek(actualResult,expectedResult,"ThirdMax test");
    }

    void testForMaxPricePerPeriod (){
        Stock subjrct = new Stock ("S",11);
        int newPrice1 = 999;
        int newPrice2 = 2;
        int newPrice3 = 1000;
        int newPrice4 = 8;
        int expectedResult = 1000;
        subjrct.updatePrice(newPrice1);
        subjrct.updatePrice(newPrice2);
        subjrct.updatePrice(newPrice3);
        subjrct.updatePrice(newPrice4);
        int actualResult = subjrct.getMaximalPrice();
        chek(actualResult,expectedResult,"ForMax test");
    }

    void testMinPricePerPeriod (){
        Stock subjrct = new Stock ("S",11);
        int newPrice1 = 999;
        int newPrice2 = 1;
        int expectedResult = 999;
        subjrct.updatePrice(newPrice1);
        subjrct.updatePrice(newPrice2);
        int actualResult = subjrct.getMaximalPrice();
        chek(actualResult,expectedResult,"MINIMAL PRICE test");
    }

    void chek (int actualResult,int expectedResult, String nameTest){
        if (actualResult == expectedResult){
            System.out.println(nameTest + " has passed: OK!");
        }else {
            System.out.println("Attention :" + nameTest + " has Fail");
            System.out.println("Expacted result is: " + expectedResult + " actual " +
                    " result is: " + actualResult);
        }
    }


}
