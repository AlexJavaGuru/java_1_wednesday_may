package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_6;

public class CreditCardTest {

    public static void main(String[] args) {
        testWithdrawCreditDebt();
        testWithdrawBalance();
        testWithdrawBalance2();
        testDepositBalance();
        testDepositBalance2();
        testDepositCreditDebt();
    }

    private static void testWithdrawCreditDebt() {
        CreditCard creditCard = new CreditCard("23443534234223245", 3242);
        creditCard.setCreditLimit(300);
        creditCard.deposit(400);
        creditCard.withdraw(600, 3242);
        check(creditCard.getCreditDebt() == 200, "Test Withdraw Credit Debt");
    }

    private static void testWithdrawBalance() {
        CreditCard creditCard = new CreditCard("23443534234223245", 3242);
        creditCard.setCreditLimit(300);
        creditCard.deposit(400);
        creditCard.withdraw(200, 3242);
        check(creditCard.getBalance() == 200, "Test Withdraw Balance");
    }

    private static void testWithdrawBalance2() {
        CreditCard creditCard = new CreditCard("23443534234223245", 3242);
        creditCard.setCreditLimit(300);
        creditCard.deposit(400);
        creditCard.withdraw(500, 3242);
        check(creditCard.getBalance() == 0, "Test Withdraw Balance 2");
    }

    private static void testDepositBalance() {
        CreditCard creditCard = new CreditCard("23443534234223245", 3242);
        creditCard.setCreditLimit(300);
        creditCard.deposit(400);
        creditCard.withdraw(500, 3242);
        creditCard.deposit(350);
        check(creditCard.getBalance() == 250, "Test Deposit Balance");
    }

    private static void testDepositBalance2() {
        CreditCard creditCard = new CreditCard("23443534234223245", 3242);
        creditCard.setCreditLimit(300);
        creditCard.deposit(400);
        creditCard.withdraw(600, 3242);
        creditCard.deposit(50);
        check(creditCard.getBalance() == 0, "Test Deposit Balance 2");
    }

    private static void testDepositCreditDebt() {
        CreditCard creditCard = new CreditCard("23443534234223245", 3242);
        creditCard.setCreditLimit(300);
        creditCard.deposit(400);
        creditCard.withdraw(600, 3242);
        creditCard.deposit(50);
        check(creditCard.getCreditDebt() == 150, "Test Deposit Balance 2");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
