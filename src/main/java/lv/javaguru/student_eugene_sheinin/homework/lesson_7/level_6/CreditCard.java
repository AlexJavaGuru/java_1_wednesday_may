package lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_6;

public class CreditCard {

    private String cardNumber;
    private int pin;
    private double balance = 0;
    private double creditLimit;
    private double creditDebt;

    public CreditCard(String cardNumber, int pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
    }

    public void deposit(double amount) {
        if (this.isValidPin(pin)) {
            this.creditDebt -= amount;
            if(this.creditDebt < 0) {
                this.balance += -(this.creditDebt);
                this.creditDebt = 0;
            }

        }
    }

    public void withdraw(double amount, int pin) {
        if (this.isValidPin(pin)) {
            if(isWithdrawWithCreditDebt(amount)) {
                this.creditDebt = -(this.balance - amount);
                this.balance = 0;
            }else{
                this.balance -= amount;
            }
        }
    }

    private boolean isWithdrawWithCreditDebt(double amount) {
        double withdrawAmount = this.balance - amount;

        return withdrawAmount < 0 && -(withdrawAmount) <= this.creditLimit;
    }

    private boolean isValidPin(int pin) {

        return this.pin == pin;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditDebt() {
        return creditDebt;
    }
}
