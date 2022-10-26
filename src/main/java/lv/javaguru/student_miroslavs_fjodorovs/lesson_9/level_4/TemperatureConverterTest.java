package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_9.level_4;

class TemperatureConverterTest {

    public static void main(String[] args) {
        KelvinConverterTest();
        FahrenheitConverterTest();
    }

    static void KelvinConverterTest() {
        KelvinConverter kelvinConverter  = new KelvinConverter();
        double realResult = kelvinConverter.convert(26.85);
        double expectedResult = 300;
        check(realResult == expectedResult, "Kelvin Converter Test");
    }

    static void FahrenheitConverterTest() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double realResult = fahrenheitConverter.convert(10);
        double expectedResult = 50;
        check(realResult == expectedResult, "Fahrenheit Converter Test");
    }

    static void check(boolean condition, String testName) {
        if (condition) {
            System.out.println(testName + " - OK");
        } else {
            System.out.println(testName + " - FAIL");
        }
    }
}
