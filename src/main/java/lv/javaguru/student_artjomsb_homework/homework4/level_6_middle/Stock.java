package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_6_middle;

class Stock {
    final private String companyName;
    int currentPrice;
    private int minPrice;
    private int maxPrice;

    Stock(String companyName, int currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void setCurrentPrice(int newPrice) {
        this.currentPrice = newPrice;
        if (currentPrice > maxPrice) {
            this.maxPrice = currentPrice;
        }
        if (currentPrice < minPrice) {
            this.minPrice = currentPrice;
        }
    }

    String getPriceInformation() {
        return "Company = \"" + companyName + "\" ,Current Price = " + currentPrice + " ,Min Price = " + minPrice + " ,Max Price = " + maxPrice;
    }
}
