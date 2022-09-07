package main.java.lv.javaguru.student_andrei_de.Homework;

public class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

     public BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerFirstName() {return this.ownerFirstName;}

    String getOwnerLastName() {return this.ownerFirstName;}

    int getMoneyAmount() {
        return this.moneyAmount;
    }
}

