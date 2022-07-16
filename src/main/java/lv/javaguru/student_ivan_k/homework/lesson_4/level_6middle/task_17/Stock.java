package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_6middle.task_17;

class Stock {

    String nameOfCompany;
    int currentPrice;
    int minimalPrice;
    int maximalPrice;

    Stock(String nameOfCompany, int newPrice) {
        this.minimalPrice = newPrice;
        this.maximalPrice = newPrice;
        this.nameOfCompany = nameOfCompany;
        this.currentPrice = newPrice;
    }

    String getNameOfCompany() {
        return nameOfCompany;
    }

    void getPriceInformation() {


        System.out.println("Company = " + " '" + nameOfCompany + "' ," + " Current Price = " + currentPrice +
        ", Min Price = " + minimalPrice + ", Max Price = " + maximalPrice);

    }

    void updatePrice(int newPrice) {
        this.currentPrice = newPrice;
        if (newPrice >= maximalPrice) {
            this.maximalPrice = newPrice;
        }else if(newPrice <= minimalPrice){
            this.minimalPrice = newPrice;
        }
    }

    public int getMaximalPrice() {
        return maximalPrice;
    }
}