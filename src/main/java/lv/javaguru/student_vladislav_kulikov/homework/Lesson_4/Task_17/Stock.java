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
            maxCost = newPrice;
        } else if (newPrice < maxCost && newPrice < minCost) {
            minCost = newPrice;
        }
    }

    int getPriceInformation() {
        System.out.println("Company: " + name + " " + "Max cost in period: " + maxCost);
        return maxCost;
    }
}
