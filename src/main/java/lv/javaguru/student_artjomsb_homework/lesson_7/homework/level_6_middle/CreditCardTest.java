package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_6_middle;

class CreditCardTest {
    public static void main(String[] args) {
        testCheckCorrectPin();
        testCheckNotCorrectPin();
        testWithDrawNotPossible();
        testWithdrawOne();
        testWithdrawTwo();
        testDeposit();
        testDepositWithLoanDebt();
        testDepositWithLoanDebtTwo();
    }
static void testDeposit(){
    CreditCard testCard = new CreditCard("1234567890", "0457");
    testCard.deposit(6, "0457");
    double result = testCard.getBalance();
    double expectedResult = 6;
    check(result == expectedResult, "Check deposit");
}
    static void testDepositWithLoanDebt(){
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.setCreditLimit(100);
        testCard.withdraw(53,"0457");
        testCard.deposit(54, "0457");
        double resultBalance = testCard.getBalance();
        double resultLoanDebt = testCard.getLoanDebt();
        check(resultBalance == 1 && resultLoanDebt == 0, "Check deposit with loan debt");
    }
    static void testDepositWithLoanDebtTwo(){
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.setCreditLimit(100);
        testCard.withdraw(53,"0457");
        testCard.deposit(33, "0457");
        double resultBalance = testCard.getBalance();
        double resultLoanDebt = testCard.getLoanDebt();
        check(resultBalance == 0 && resultLoanDebt == 20, "Check deposit with loan debt");
    }
    static void testWithDrawNotPossible() {
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.withdraw(5, "0457");
        double resultBalance = testCard.getBalance();
        double resultLoanDebt = testCard.getLoanDebt();
        check(resultBalance == 0 && resultLoanDebt == 0, "Test check that withdraw not possible");
    }

    static void testWithdrawOne() {
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.deposit(6, "0457");
        testCard.withdraw(5, "0457");
        double result = testCard.getBalance();
        double expectedResult = 1;
        check(result == expectedResult, "Check withdraw");
    }

    static void testWithdrawTwo() {
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.deposit(6, "0457");
        testCard.setCreditLimit(50);
        testCard.withdraw(23, "0457");
        double resultBalance = testCard.getBalance();
        double resultLoanDebt = testCard.getLoanDebt();
        check(resultBalance == 0 && resultLoanDebt == 17, "Check withdraw with credit limit");
    }

    static void testCheckCorrectPin() {
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.deposit(1, "0457");
        double result = testCard.getBalance();
        double expectedResult = 1;
        check(result == expectedResult, "Check that operation was successful and pin working");
    }

    static void testCheckNotCorrectPin() {
        CreditCard testCard = new CreditCard("1234567890", "0457");
        testCard.deposit(1, "0357");
        double result = testCard.getBalance();
        double expectedResult = 0;
        check(result == expectedResult, "Check that operation wasn't successful and pin not working");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
