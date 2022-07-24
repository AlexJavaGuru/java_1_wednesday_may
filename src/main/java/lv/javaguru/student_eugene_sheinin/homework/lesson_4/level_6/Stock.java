package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_6;

class Stock {

    String stockName;
    double minPrice;
    double maxPrice;
    double currentPrice;

    Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.minPrice = stockPrice;
        this.maxPrice = stockPrice;
        this.currentPrice = stockPrice;

    }

    void updatePrice(double newPrice) {

        if(this.minPrice > newPrice) {
            this.minPrice = newPrice;
        } else if (this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
        }

        this.currentPrice = newPrice;
    }

    double getMinPrice() {
        return minPrice;
    }

    double getMaxPrice() {
        return maxPrice;
    }

    String getPriceInformation() {

        return "Company = " + this.stockName +
                ", Current Price = " + this.currentPrice +
                ", Min Price = " + this.minPrice +
                ", Max Price = " + this.maxPrice;
    }
}
