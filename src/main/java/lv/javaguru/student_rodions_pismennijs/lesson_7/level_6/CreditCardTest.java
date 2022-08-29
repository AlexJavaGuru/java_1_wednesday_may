package lv.javaguru.student_rodions_pismennijs.lesson_7.level_6;

class CreditCardTest {

    public static void main(String[] args) {
        creditLimitTest();
        wrongPinCodeTest();
        depositTest();
        withdrawTest();
        withdrawWithLoanDebtTest();
        creditLimitExceededTest();
        maximumLoanDebtTest();
        loanDebtRepaymentTest();
        depositWithLoanDebtTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static CreditCard creditCard = new CreditCard("15676987452", "1567");

    static void creditLimitTest() {
        creditCard.setCreditLimit(50);
        check(creditCard.getCreditLimit() == 50, "Credit Limit Test");
    }

    static void wrongPinCodeTest() {
        creditCard.deposit("1234", 20);
        check(creditCard.getBalance() == 0, "Wrong Pin Code Test");
    }

    static void depositTest() {
        creditCard.deposit("1567", 220);
        check(creditCard.getBalance() == 220, "Deposit Test");
    }

    static void withdrawTest() {
        creditCard.withdraw("1567", 150);
        check(creditCard.getBalance() == 70, "Withdraw Test");
    }

    static void withdrawWithLoanDebtTest() {
        creditCard.withdraw("1567", 80);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 10, "Withdraw With Loan Debt Test");
    }

    static void creditLimitExceededTest() {
        creditCard.withdraw("1567", 50);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 10, "Credit Limit Exceeded Test");
    }

    static void maximumLoanDebtTest() {
        creditCard.withdraw("1567", 40);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 50, "Maximum Loan Debt Test");
    }

    static void loanDebtRepaymentTest() {
        creditCard.deposit("1567", 30);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 20, "Loan Debt Repayment Test");
    }

    static void depositWithLoanDebtTest() {
        creditCard.deposit("1567", 100);
        check(creditCard.getBalance() == 80 && creditCard.getLoanDebt() == 0, "Deposit With Loan Debt Test");
    }
}
