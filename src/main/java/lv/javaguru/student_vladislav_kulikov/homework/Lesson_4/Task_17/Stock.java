package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_4.Task_17;

class Stock {

    String name;

    int cost;

    int minCost;

    int maxCost;

    Stock(String name, int cost) {
        this.name = name;
        this.cost = cost;
        minCost = cost;
        maxCost = cost;
    }

    void updatePrice(int newPrice) {
        if (newPrice > maxCost) {
            cost = newPrice;
            maxCost = newPrice;
        } else if (newPrice < minCost) {
            cost = newPrice;
            minCost = newPrice;

        }
    }

    int getPriceInformation() {
        System.out.println("Company: " + name + " " + "Max cost in period: " + maxCost + " Current price: " + cost);
        return maxCost;
    }
}
