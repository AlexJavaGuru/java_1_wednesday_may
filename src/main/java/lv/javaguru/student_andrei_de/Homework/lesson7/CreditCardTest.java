package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;

class CreditCardTest {

    public static void main(String[] args) {
        creditLimitTest();
        wrongPinCodeTest();
        depositTest();
        withDrawTest();
        withDrawLoanDebtTest();
        creditLimitExceededTest();
        maximumLoanDebt();
        loanDebtRepaymentTest();
        depositWithLoanDebtTest();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - Fail");
        }
    }

    static CreditCard creditCard = new CreditCard("8764824686", "5552");


    static  void creditLimitTest() {
        creditCard.setCreditLimit(50);
        check(creditCard.getCreditLimit() == 50, "Credit Limit Test");
    }

    static void wrongPinCodeTest() {
        creditCard.deposit("1259",20);
        check(creditCard.getBalance() == 0, "Pin Code Test Fail");
    }

    static void depositTest() {
        creditCard.deposit("5552", 220);
        check(creditCard.getBalance() == 220, "Deposit Test");
    }

    static void withDrawTest() {
        creditCard.WithDraw("5552", 150);
        check(creditCard.getBalance() == 70, "Withdraw Test");
    }

    static void withDrawLoanDebtTest(){
        creditCard.WithDraw("5552", 80);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 10, "Withdraw with Loan Debt Test");
    }

    static void creditLimitExceededTest() {
        creditCard.WithDraw("5552", 50);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 10, "Credit Limit Exceeded Test");
    }

    static void maximumLoanDebt () {
        creditCard.WithDraw("5552", 40);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 50, "Maximum Loan Debt Test");
    }

    static void loanDebtRepaymentTest() {
        creditCard.deposit("5552", 30);
        check(creditCard.getBalance() == 0 && creditCard.getLoanDebt() == 20, "Loan Debt Repayment Test");
    }

    static void depositWithLoanDebtTest() {
        creditCard.deposit("5552", 100);
        check(creditCard.getBalance() == 80 && creditCard.getLoanDebt() == 0, "Deposit With Loan Debt Test");
    }
}
