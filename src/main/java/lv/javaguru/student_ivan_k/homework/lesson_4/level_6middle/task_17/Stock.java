package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_6middle.task_17;

class Stock {

    String nameOfCompany;
    int currentPrice;
    int minimalPrice;
    int maximalPrice;
    int newPrice;

    Stock (String nameOfCompany,int currentPrice){
        this.nameOfCompany = nameOfCompany;
        this.currentPrice = currentPrice;
    }

    int getPriceInformation(){
        return currentPrice;
    }

    int updatePrice (int newPrice ){
        this.currentPrice = newPrice;
        return currentPrice;
    }


    void info (){
        System.out.println("Market price stock of company " + nameOfCompany + " " + getPriceInformation());
    }





}
