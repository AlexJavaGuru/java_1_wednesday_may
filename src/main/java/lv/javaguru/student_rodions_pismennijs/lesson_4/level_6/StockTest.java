package main.java.lv.javaguru.student_rodions_pismennijs.lesson_4.level_6;

class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.google();
        test.tesla();
        test.microsoft();
        test.vk();
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

    public void check(int expectMax, int actualMax, String testName) {
        if (expectMax == actualMax) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectMax + " but actual is: " + actualMax);
        }
    }

    public void tesla() {
        Stock tesla = new Stock("Tesla", 999);
        tesla.updatePrice(1);
        int expectMax = 999;
        int actualMax = tesla.maxPrice;
        check(expectMax, actualMax, "Tesla");
    }

    public void microsoft() {
        Stock microsoft = new Stock("Microsoft", 999);
        microsoft.updatePrice(2);
        microsoft.updatePrice(1000);
        microsoft.updatePrice(8);
        int expectMax = 1000;
        int actualMax = microsoft.maxPrice;
        check(expectMax, actualMax, "Microsoft");
    }

    public void vk() {
        Stock vk = new Stock("VK", 9);
        vk.updatePrice(27);
        int expectMax = 27;
        int actualMax = vk.maxPrice;
        check(expectMax, actualMax, "VK");
    }
}
