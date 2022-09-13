package lv.javaguru.student_artjomsb_homework.lesson_11_srp.homework.level_4_junior;

class FraudDetectorTest {
    public static void main(String[] args) {
        FraudDetectorTest runner = new FraudDetectorTest();
        runner.testIsAmountAndCountryFraud();
        runner.testIsAmountAndCountryNotFraud();
        runner.testIsAmountFraud();
        runner.testIsAmountNotFraud();
        runner.testIsTraderFraud();
        runner.testIsTraderNotFraud();
        runner.testIsCountryFraud();
        runner.testIsCountryNotFraud();
        runner.testIsCityFraud();
    }

    private void testIsAmountAndCountryNotFraud() {
        Trader trader = new Trader("Name", "City", "Germany");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(!result, "Test not fraud rule four");
    }

    private void testIsAmountAndCountryFraud() {
        Trader trader = new Trader("Name", "City", "Germany");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(result, "Test fraud rule four");
    }

    private void testIsCountryNotFraud() {
        Trader trader = new Trader("Name", "City", "Country");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(!result, "Test country not Fraud");
    }

    private void testIsCountryFraud() {
        Trader trader = new Trader("Name", "City", "Jamaica");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(result,"Test country is fraud");
    }

    private void testIsCityFraud() {
        Trader trader = new Trader("Name", "Sydney", "Country");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(result,"Test city is fraud");
    }


    private void testIsAmountFraud() {
        Trader trader = new Trader("Name", "City", "Country");
        Transaction transaction = new Transaction(trader, 1000001);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(result,"Test amount is fraud");
    }

    private void testIsAmountNotFraud() {
        Trader trader = new Trader("Name", "City", "Country");
        Transaction transaction = new Transaction(trader, 1000000);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(!result,"test amount is not fraud");
    }

    private void testIsTraderFraud() {
        Trader trader = new Trader("Pokemon", "City", "Country");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(result,"Test is trader name fraud");
    }

    private void testIsTraderNotFraud() {
        Trader trader = new Trader("Name", "City", "Country");
        Transaction transaction = new Transaction(trader, 100);
        FraudDetector fraudDetector = new FraudDetector();
        boolean result = fraudDetector.isFraud(transaction);
        check(!result,"Test is trader name not fraud");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
