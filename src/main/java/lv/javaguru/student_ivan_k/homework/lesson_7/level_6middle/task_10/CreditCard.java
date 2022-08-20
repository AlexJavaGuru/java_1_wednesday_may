package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_6middle.task_10;

import java.util.Objects;

class CreditCard {

    private long numberOfCredCard;
    private int pinCod;
    private double balance;
    private double creditLimit;
    private double creditArrear;

    public CreditCard(long numberOfCredCard, int pinCod) {
        this.numberOfCredCard = numberOfCredCard;
        this.pinCod = pinCod;
    }

    public void deposit(int pinCod, int money) {
        if (this.pinCod == pinCod) {
            System.out.println("Pin OK.");
            if (creditArrear < 0) {
                this.creditArrear += money;
                if (creditArrear > 0) {
                    balance = creditArrear;
                    creditArrear = 0;
                }
            } else if (this.creditArrear == 0) {
                this.balance = balance + money;
            }
        } else {
            System.out.println("Pin-code is not correct. Canceled.");
        }


    }

    public void withdraw(int pinCod, double money) {
        double shortage = 0;
        double patOfCredit = 0;
        if (this.pinCod == pinCod) {
            System.out.println("PIN OK");
            if (balance >= money) {
                this.balance -= money;
            } else if (balance < money && balance > 0) {
                shortage = money - balance;
                this.creditArrear -= shortage;
                this.balance = 0;
                System.out.println("Sum withdrawal " + money + " credit arrear " + creditArrear);
            } else if (balance == 0 && patOfCredit < this.creditLimit) {
                patOfCredit = this.creditLimit - (this.creditArrear * -1);
                if (patOfCredit + 1 > money) {
                    this.creditArrear = creditArrear - money;
                    System.out.println("Payment of the money " + money + " credit arrear " + creditArrear);
                } else {
                    System.out.println("Credit limit exceeded. Canceled");
                }
            }
        } else
            System.out.println("Pin-code is not correct. Canceled.");

    }


    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditArrear() {
        return creditArrear;
    }
}
