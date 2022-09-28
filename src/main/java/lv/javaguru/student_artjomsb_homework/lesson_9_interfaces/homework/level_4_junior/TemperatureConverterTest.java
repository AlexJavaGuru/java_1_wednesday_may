package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_4_junior;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest tester = new TemperatureConverterTest();
        tester.testKelvinConverter();
        tester.testFahrenheitConverter();
    }

    public void testKelvinConverter() {
        TemperatureConverter converter = new KelvinConverter();
        double celsius = 1.05;
        double expectedResult = 274.2;
        double actualResult = converter.convert(celsius);
        check(expectedResult == actualResult, "Test converting in kelvin");
    }

    public void testFahrenheitConverter() {
        TemperatureConverter converter = new FahrenheitConverter();
        double celsius = 1;
        double expectedResult = 33.8;
        double actualResult = converter.convert(celsius);
        check(expectedResult == actualResult, "Test converting in Fahrenheit");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
