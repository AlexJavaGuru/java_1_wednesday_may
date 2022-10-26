package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_6;

import java.sql.SQLOutput;

class StockTest {

    public static void main(String[] args) {
        StockTest stockTest = new StockTest();
        stockTest.google();
        stockTest.meta();
        stockTest.amazon();
        stockTest.microsoft();
    }

    public void google() {
        Stock google = new Stock("GOOG", 10);
        google.getPriceInformation();
        google.updatePrice(12);
        google.updatePrice(5);
        google.updatePrice(7);
        google.updatePrice(99);
        google.updatePrice(77);
        google.getPriceInformation();
    }

    public void check(int expectedResultMax, int realResultMax, String testName) {
        if (expectedResultMax == realResultMax) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + " but actual is: " + realResultMax);
        }
    }

    public void meta() {
        Stock meta = new Stock("Meta", 999);
        meta.updatePrice(1);
        int expectedResultMax = 999;
        int realResultMax = meta.maxPrice;
        check(expectedResultMax, realResultMax, "Meta");
    }

    public void amazon() {
        Stock amazon = new Stock("Amazon", 999);
        amazon.updatePrice(2);
        amazon.updatePrice(1000);
        amazon.updatePrice(8);
        int expectedResultMax = 1000;
        int realResultMax = amazon.maxPrice;
        check(expectedResultMax, realResultMax, "Amazon");
    }

    public void microsoft() {
        Stock microsoft = new Stock("Microsoft", 9);
        microsoft.updatePrice(27);
        int expectedResultMax = 27;
        int realResultMax = microsoft.maxPrice;
        check(expectedResultMax, realResultMax, "Microsoft");
    }
}
