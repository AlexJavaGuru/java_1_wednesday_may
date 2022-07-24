package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_6;

public class StockTest {
    public static void main(String[] args) {
        StockTest test = new StockTest();
        test.adazi();
        test.bolt();
        test.wolt();
        test.mezpils();
    }

    public void adazi() {
        Stock adazi = new Stock("Adazi", 18);
        adazi.getPriceInformation();
        adazi.updatePrice(17);
        adazi.updatePrice(11);
        adazi.updatePrice(4);
        adazi.updatePrice(62);
        adazi.updatePrice(71);
        adazi.getPriceInformation();
    }

    public void check(int expectMax, int actualMax, String testName) {
        if (expectMax == actualMax) {
            System.out.println(testName + " has passed");
        } else {
            System.out.println(testName + " has failed");
            System.out.println("Expected: " + expectMax + " but actual is: " + actualMax);
        }
    }

    public void bolt() {
        Stock bolt = new Stock("Bolt", 450);
        bolt.updatePrice(178);
        int expectMax = 450;
        int actualMax = bolt.maxPrice;
        check(expectMax, actualMax, "Bolt");
    }

    public void wolt() {
        Stock wolt = new Stock("Wolt", 670);
        wolt.updatePrice(190);
        wolt.updatePrice(900);
        wolt.updatePrice(234);
        int expectMax = 900;
        int actualMax = wolt.maxPrice;
        check(expectMax, actualMax, "Wolt");
    }

    public void mezpils() {
        Stock mezpils = new Stock("Mezpils Alus", 150);
        mezpils.updatePrice(145);
        int expectMax = 150;
        int actualMax = mezpils.maxPrice;
        check(expectMax, actualMax, "Mezpils Alus");
    }
}

