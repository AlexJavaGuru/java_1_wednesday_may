package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

class TemperatureConverterTest {
    public static void main(String[] args) {
        TemperatureConverterTest runner = new TemperatureConverterTest();
        runner.testKelvinConvertToCelsius();
        runner.testKelvinConvertToFahrenheit();
        runner.testKelvinConvertToKelvin();
        runner.testCelsiusConvertToKelvin();
        runner.testCelsiusConvertToFahrenheit();
        runner.testCelsiusConvertToCelsius();
        runner.testFahrenheitConvertToCelsius();
        runner.testFahrenheitConvertToKelvin();
        runner.testFahrenheitConvertToFahrenheit();
    }

    public void testKelvinConvertToCelsius() {
        Degree converter = new Degree(new KelvinConverter());
        double degree = 1.05;
        double expectedResult = 274.2;
        String actualResult = converter.convert("Celsius", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Kelvin to Celsius");
    }

    public void testKelvinConvertToFahrenheit() {
        Degree converter = new Degree(new KelvinConverter());
        double degree = 278.15;
        double expectedResult = 41;
        String actualResult = converter.convert("Fahrenheit", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Kelvin to Fahrenheit");
    }

    public void testKelvinConvertToKelvin() {
        Degree converter = new Degree(new KelvinConverter());
        double degree = 1.05;
        double expectedResult = 1.05;
        String actualResult = converter.convert("Kelvin", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Kelvin to Kelvin");
    }

    public void testCelsiusConvertToKelvin() {
        Degree converter = new Degree(new CelsiusConverter());
        double degree = 5;
        double expectedResult = 278.15;
        String actualResult = converter.convert("Kelvin", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Celsius to Kelvin");
    }

    public void testCelsiusConvertToFahrenheit() {
        Degree converter = new Degree(new CelsiusConverter());
        double degree = 45;
        double expectedResult = 113;
        String actualResult = converter.convert("Fahrenheit", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Celsius to Fahrenheit");
    }

    public void testCelsiusConvertToCelsius() {
        Degree converter = new Degree(new CelsiusConverter());
        double degree = -25.5;
        double expectedResult = -25.5;
        String actualResult = converter.convert("Celsius", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Celsius to Celsius");
    }

    public void testFahrenheitConvertToCelsius() {
        Degree converter = new Degree(new FahrenheitConverter());
        double degree = 113;
        double expectedResult = 45;
        String actualResult = converter.convert("Celsius", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Fahrenheit to Celsius");
    }

    public void testFahrenheitConvertToKelvin() {
        Degree converter = new Degree(new FahrenheitConverter());
        double degree = 41;
        double expectedResult = 278.15;
        String actualResult = converter.convert("Kelvin", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Fahrenheit to Kelvin");
    }

    public void testFahrenheitConvertToFahrenheit() {
        Degree converter = new Degree(new FahrenheitConverter());
        double degree = 45;
        double expectedResult = 45;
        String actualResult = converter.convert("Fahrenheit", degree);
        check(actualResult.equals("" + expectedResult), "Test converting Fahrenheit to Fahrenheit");
    }

    static void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println("Test - " + testName + ", is Passed");
        } else {
            System.out.println("Test - " + testName + ", is Failed");
        }
    }
}
