package lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_10;

class CreditCard {

    private String cardNumber;

    private int cardPinCode;

    private int balance;

    private int creditLimit;

    private int loanDebt;


    CreditCard(String cardNumber, int cardPinCode) {
        this.cardNumber = cardNumber;
        this.cardPinCode = cardPinCode;
        this.balance = 0;
        this.creditLimit = 0;
        this.loanDebt = 0;
    }

    void deposit(int cardPinCode, int sum) {
        if (cardPinCode == this.cardPinCode) {
            if (loanDebt > 0) {
                loanDebt -= sum;
                if (loanDebt < 0) {
                    loanDebt = 0;
                }
            }
            if (sum != 0) {
                balance += sum;
            } else {
                System.out.println("The amount you want to deposit is zero");
            }
        } else {
            System.out.println("Wrong PinCode");
        }
    }

    void withDraw(int cardPinCode, int sum) {
        if (cardPinCode == this.cardPinCode) {
            if (creditLimit == 0 || creditLimit >= sum) {
                if (balance <= 0) {
                    loanDebt = sum;
                }
                if (sum != 0) {
                    balance -= sum;
                } else {
                    System.out.println("The amount you want to withdraw is zero");
                }
            } else if (sum > creditLimit) {
                System.out.println("Wrong, too big sum");
            }
        } else {
            System.out.println("Wrong PinCode");
        }
    }

    void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    int getBalance() {
        return balance;
    }

    int getCreditLimit() {
        return creditLimit;
    }

    int getLoanDebt() {
        return loanDebt;

    }

    void setLoanDebt(int loanDebt) {
        this.loanDebt = loanDebt;
        this.balance -= loanDebt;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }
}
