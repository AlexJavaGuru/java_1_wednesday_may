package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_6;

class Stock {

    public static void main(String[] args) {

        Stock google = new Stock("GOOGLE", 10);
        String priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);

        google.updatePrice(15);
        google.updatePrice(7);
        google.updatePrice(14);

        priceInformation = google.getPriceInformation();
        System.out.println(priceInformation);
    }

    String stockName;
    double minPrice;
    double maxPrice;
    double currentPrice;

    public Stock(String stockName, double stockPrice) {
        this.stockName = stockName;
        this.minPrice = stockPrice;
        this.maxPrice = stockPrice;
        this.currentPrice = stockPrice;

    }

    void updatePrice(double newPrice) {
        if(this.minPrice > newPrice) {
            this.minPrice = newPrice;
        }

        if(this.maxPrice < newPrice) {
            this.maxPrice = newPrice;
        }
        this.currentPrice = newPrice;
    }

    public double getMinPrice() {
        return minPrice;
    }

    public double getMaxPrice() {
        return maxPrice;
    }

    String getPriceInformation() {

        return "Company = " + this.stockName +
                ", Current Price = " + this.currentPrice +
                ", Min Price = " + this.minPrice +
                ", Max Price = " + this.maxPrice;
    }
}
