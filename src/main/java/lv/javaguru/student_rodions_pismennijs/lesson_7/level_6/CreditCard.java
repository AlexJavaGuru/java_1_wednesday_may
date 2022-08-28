package lv.javaguru.student_rodions_pismennijs.lesson_7.level_6;

import java.util.Objects;

class CreditCard {

    private String cardNumber;
    private String pinCode;
    private double balance;
    private double creditLimit;
    private double loanDebt;

    public CreditCard(String cardNumber, String pinCode) {
        this.cardNumber = cardNumber;
        this.pinCode = pinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    public void deposit(String pinCode, double money) {
        if (isPinCodeCorrect(pinCode) && money > 0) {
            increaseBalance(money);
        } else {
            System.out.println("Transaction cancelled");
        }
    }

    private void increaseBalance(double money) {
        if (loanDebt == 0) {
            balance += money;
        } else if (loanDebt <= money) {
            balance = money - loanDebt;
            loanDebt = 0;
        } else {
            loanDebt -= money;
        }
    }

    public void withdraw(String pinCode, double money) {
        if (isPinCodeCorrect(pinCode) && isPossibleToWithdraw(money) && money > 0) {
            reduceBalance(money);
        } else {
            System.out.println("Transaction cancelled");
        }
    }

    private void reduceBalance(double money) {
        if (balance - money >= 0) {
            balance -= money;
        } else {
            loanDebt += money - balance;
            balance = 0;
        }
    }

    private boolean isPossibleToWithdraw(double money) {
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
}
