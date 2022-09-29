package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_6;

import java.util.Objects;

class CreditCard {

    private String cardNumber;
    private String cardPin;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(String cardNumber, String cardPin) {
        this.cardNumber = cardNumber;
        this.cardPin = cardPin;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    private boolean isCardPinCorrect(String cardPin) {
        return Objects.equals(this.cardPin, cardPin);
    }

    private boolean isPossibleToWithdraw(double moneyAmount) {
        return loanDebt + moneyAmount - balance <= creditLimit;
    }

    public void deposit(String cardPin, double moneyAmount) {
        if (isCardPinCorrect(cardPin) && moneyAmount > 0) {
            increaseBalance(moneyAmount);
        } else {
            System.out.println("Transaction declined");
        }
    }

    private void increaseBalance(double moneyAmount) {
        if (loanDebt == 0) {
            balance += moneyAmount;
        } else if (loanDebt <= moneyAmount) {
            balance = moneyAmount - loanDebt;
            loanDebt = 0;
        } else {
            loanDebt -= moneyAmount;
        }
    }

    public void withdraw(String cardPin, double moneyAmount) {
        if (isCardPinCorrect(cardPin) && isPossibleToWithdraw(moneyAmount) && moneyAmount > 0) {
            reduceBalance(moneyAmount);
        } else {
            System.out.println("Transaction declined");
        }
    }

    private void reduceBalance(double moneyAmount) {
        if (balance - moneyAmount >= 0) {
            balance -= moneyAmount;
        } else {
            loanDebt += moneyAmount - balance;
            balance = 0;
        }
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
}
