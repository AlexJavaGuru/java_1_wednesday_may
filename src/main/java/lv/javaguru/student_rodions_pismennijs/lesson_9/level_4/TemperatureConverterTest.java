package main.java.lv.javaguru.student_rodions_pismennijs.lesson_9.level_4;

class TemperatureConverterTest {

    public static void main(String[] args) {
        testKelvin();
        testFahrenheit();
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }

    static void testKelvin() {
        TemperatureConverter test = new KelvinConverter();
        double celsium = 31.5;
        check(test.convert(celsium) == 304.65, "Kelvin Test");
    }

    static void testFahrenheit() {
        TemperatureConverter test = new FahrenheitConverter();
        double celsium = 20;
        check(test.convert(celsium) == 68, "Fahrenheit Test");
    }
}
