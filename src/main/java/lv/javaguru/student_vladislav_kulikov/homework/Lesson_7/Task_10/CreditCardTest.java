package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_7.Task_10;

class CreditCardTest {

    public static void main(String[] args) {
        depositTest();
        noDepositTest();
        wrongPinCodeDepositTest();
        loanDebtTest();
        withDrawTest();
        noWithDrawTest();
        withDrawCreditLimitTest();
        withDrawCreditLimitTwo();
    }

    static void depositTest() {
        CreditCard subject = new CreditCard("222 3333 4444", 3333);
        subject.deposit(3333, 100);
        int actualResult = subject.getBalance();
        check(actualResult == 100, "Deposit Test");
    }

    static void noDepositTest() {
        CreditCard subject = new CreditCard("222 3333 4444", 3333);
        subject.deposit(3333, 0);
        int actualResult = subject.getBalance();
        check(actualResult == 0, "Zero Deposit Test");
    }

    static void wrongPinCodeDepositTest() {
        CreditCard subject = new CreditCard("222 3333 4444", 3333);
        subject.deposit(3320, 200);
        int actualResult = subject.getBalance();
        check(actualResult == 0, "Wrong PinCode Deposit Test");
    }

    static void loanDebtTest() {
        CreditCard subject = new CreditCard("222 3333 4444", 3333);
        subject.setLoanDebt(100);
        subject.deposit(3333, 200);
        int actualResult = subject.getBalance();
        check(actualResult == 100, "Loan Debt Test");
    }

    static void withDrawTest() {
        CreditCard subject = new CreditCard("333 5555 888", 1111);
        subject.setBalance(1000);
        subject.withDraw(1111, 100);
        int actualResult = subject.getBalance();
        check(actualResult == 900, "Withdraw Test");
    }

    static void noWithDrawTest() {
        CreditCard subject = new CreditCard("333 5555 888", 1111);
        subject.withDraw(1111, 0);
        int actualResult = subject.getBalance();
        check(actualResult == 0, "Zero Withdraw Test");
    }

    static void withDrawCreditLimitTest() {
        CreditCard subject = new CreditCard("333 5555 888", 1111);
        subject.setCreditLimit(100);
        subject.withDraw(1111, 50);
        int actualResult = subject.getBalance();
        check(actualResult == -50, "Credit Limit Test One");
    }

    static void withDrawCreditLimitTwo() {
        CreditCard subject = new CreditCard("333 5555 888", 1111);
        subject.setCreditLimit(100);
        subject.withDraw(1111, 1000);
        int actualResult = subject.getBalance();
        check(actualResult == 0, "Credit Limit Test too big sum for limit Test");
    }

    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
