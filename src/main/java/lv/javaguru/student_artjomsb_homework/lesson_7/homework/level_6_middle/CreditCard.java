package main.java.lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_6_middle;

import java.util.Objects;

class CreditCard {
    private String cardNumber;
    private String pinCode;

    private double balance;

    private double creditLimit;

    private double loanDebt;

    CreditCard(String cardNumber,String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
    }

    void deposit(double money, String pinCode) {
        if (isPinCorrect(pinCode) && money > 0) {
            addMoneyOrReduceDebt(money);
        } else {
            System.out.println("Transaction failed");
        }
    }

    void withdraw(double money, String pinCode) {
        if (isPinCorrect(pinCode) && isEnoughMoneyOnCard(money) && money > 0) {
            takeMoneyFromCard(money);
        } else {
            System.out.println("Transaction failed");
        }
    }

    private void addMoneyOrReduceDebt(double money) {
        if (loanDebt == 0) {
            this.balance += money;
        } else if (loanDebt < money) {
            this.balance = money - loanDebt;
            this.loanDebt = 0;
        } else {
            this.loanDebt -= money;
        }
    }

    private void takeMoneyFromCard(double money) {
        if (balance - money >= 0)
            this.balance -= money;
        else {
            this.loanDebt += money - balance;
            this.balance = 0;
        }
    }

    private boolean isEnoughMoneyOnCard(double number) {
        return loanDebt + number - balance < creditLimit;
    }

    private boolean isPinCorrect(String pinCode) {
        return Objects.equals(this.pinCode, pinCode);
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getLoanDebt() {
        return loanDebt;
    }
}
