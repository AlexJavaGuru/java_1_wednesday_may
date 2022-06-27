package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_6_middle;

class Stock {
    final private String companyName;
    double currentPrice;
    private double minPrice;
    private double maxPrice;

    Stock(String companyName, double currentPrice) {
        this.companyName = companyName;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    void setCurrentPrice(double newPrice) {
        this.currentPrice = newPrice;
        if (currentPrice > maxPrice) {
            this.maxPrice = currentPrice;
        }
        if (currentPrice < minPrice) {
            this.minPrice = currentPrice;
        }
    }

    String getPriceInformation() {
        return "Company = \"" + companyName + "\", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice;
    }
}
