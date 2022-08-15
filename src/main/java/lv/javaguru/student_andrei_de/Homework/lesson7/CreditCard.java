package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

import java.util.Objects;

class CreditCard {
    
    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(String CardNumber, String PinCode) {
        this.cardNumber = CardNumber;
        this.pinCode = PinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    public void deposit(String PinCode, double money) {
        if (isPinCodeCorrect(PinCode) && money > 0) {
            increaseBalance(money);
        } else {
            System.out.println("Transaction cancelled");
        }
    }

    private void increaseBalance(double money){
        if (loanDebt == 0) {
            balance += money;
        } else if (loanDebt <= money) {
            balance = money - loanDebt;
            loanDebt = 0;
        } else {
            loanDebt -= money;
        }
    }

    public void WithDraw(String PinCode, double money) {
        if (isPinCodeCorrect(PinCode) && isPossibleToWithDraw(money) && money > 0) {
            ReduceBalance(money);
        } else {
            System.out.println("Transaction cancelled");
        }
    }

    private void ReduceBalance(double money) {
        if (balance - money >= 0) {
            balance -= money;
        } else {
            loanDebt += money - balance;
            balance = 0;
        }
    }

    private boolean isPossibleToWithDraw(double money) {
        return loanDebt + money - balance <= creditLimit;
    }

    private boolean isPinCodeCorrect(String pinCode) {
        return Objects.equals(this.pinCode, pinCode);
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public double getLoanDebt() {
        return loanDebt;
    }

    public void withdraw(String s, int i) {
    }
}
