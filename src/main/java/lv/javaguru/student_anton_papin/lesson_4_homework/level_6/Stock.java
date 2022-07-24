package main.java.lv.javaguru.student_anton_papin.lesson_4_homework.level_6;

public class Stock {
    String name;
    int currentPrice;
    int minPrice;
    int maxPrice;

    Stock(String name, int currentPrice) {
        this.name = name;
        this.currentPrice = currentPrice;
        this.minPrice = currentPrice;
        this.maxPrice = currentPrice;
    }

    public void updatePrice(int newPrice) {
        currentPrice = newPrice;
        if (newPrice < minPrice) {
            minPrice = newPrice;
        } else if (newPrice > maxPrice) {
            maxPrice = newPrice;
        }
    }

    public void getPriceInformation() {
        System.out.println("Company = " + name + ", Current Price = " + currentPrice + ", Min Price = " + minPrice + ", Max Price = " + maxPrice);
    }
}
