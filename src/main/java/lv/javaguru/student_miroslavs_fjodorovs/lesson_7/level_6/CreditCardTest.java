package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        CreditCardTest creditCardTest = new CreditCardTest();
        creditCardTest.wrongCardPinTest();
        creditCardTest.creditLimitTest();
        creditCardTest.depositTest();
        creditCardTest.withdrawTest();
        creditCardTest.withdrawWithLoanDebtTest();
        creditCardTest.withdrawWithSurpassedCreditLimitTest();
        creditCardTest.withdrawWithMaxLoanDebtTest();
        creditCardTest.depositWithLoanDebtAndNegativeBalanceTest();
        creditCardTest.depositWithLoanDebtAndPositiveBalanceTest();
    }

    static CreditCard creditCard = new CreditCard("1234567890123456", "1234");

    static void wrongCardPinTest() {
        creditCard.deposit("0001", 100);
        check(creditCard.getBalance() == 0, "Wrong Card PIN Test");
    }

    static void creditLimitTest() {
        creditCard.setCreditLimit(100);
        check(creditCard.getCreditLimit() == 100, "Card Credit Limit Test");
    }

    static void depositTest() {
        creditCard.deposit("1234", 100);
        check(creditCard.getBalance() == 100, "Card Deposit Test");
    }

    static void withdrawTest() {
        creditCard.withdraw("1234", 70);
        check(creditCard.getBalance() == 30, "Card Withdraw Test");
    }

    static void withdrawWithLoanDebtTest() {
        creditCard.withdraw("1234", 31);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 1, "Card Withdraw With Loan Debt Test");
    }

    static void withdrawWithSurpassedCreditLimitTest() {
        creditCard.withdraw("1234", 100);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 1, "Card Withdraw With Surpassed Credit Limit Test");
    }

    static void withdrawWithMaxLoanDebtTest() {
        creditCard.withdraw("1234", 99);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 100, "Card Withdraw With Max Loan Debt Test");
    }

    static void depositWithLoanDebtAndNegativeBalanceTest() {
        creditCard.deposit("1234", 99);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 1, "Card Deposit With Loan Debt And Negative Balance Test");
    }

    static void depositWithLoanDebtAndPositiveBalanceTest() {
        creditCard.deposit("1234", 101);
        check(creditCard.getBalance() == 100 && creditCard.getLoanDebt() == 0, "Card Deposit With Loan Debt And Positive Balance Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
