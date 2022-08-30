package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_4;

public class TemperatureConverterTest {

    public static void main(String[] args) {
        TestKelvinConverter();
        TestFahrenheitConverter();
    }


    private static void TestFahrenheitConverter() {
        TemperatureConverter temperatureConverter = new FahrenheitConverter();
        check(
                temperatureConverter.convert(32) == 89.6,
                "TestFahrenheitConverter");
    }

    private static void TestKelvinConverter() {
        TemperatureConverter temperatureConverter = new KelvinConverter();
        check(
                temperatureConverter.convert(32) == 305.15,
                "TestKelvinConverter");
    }

    private static void check(boolean actualResult, String testName) {
        if (actualResult) {
            System.out.println("Test - " + testName + " has passed");
        } else {
            System.out.println("Test - " + testName + " has failed");
        }
    }
}
