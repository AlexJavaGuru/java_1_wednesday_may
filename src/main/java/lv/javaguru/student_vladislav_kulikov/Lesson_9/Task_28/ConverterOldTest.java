package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_28;

class ConverterOldTest {
    public static void main(String[] args) {
        testCelsius();
        testKelvin();
        testFahrenheit();
    }

    static void testCelsius() {
        ConverterOld converterOld = new ConverterOld();
        double resultOne = converterOld.fromCelsiusToKelvin(10);
        double resultTwo = converterOld.fromCelsiusToFahrenheit(10);
        check(resultOne == 283.15 && resultTwo == 42.0, "Test Celsius");
    }

    static void testKelvin() {
        ConverterOld converterOld = new ConverterOld();
        double resultOne = converterOld.fromKelvinToCelsius(10);
        double resultTwo = converterOld.fromKelvinToFahrenheit(10);
        check(resultOne == -263.15 && resultTwo == -231.14999999999998, "Test Celsius");
    }

    static void testFahrenheit() {
        ConverterOld converterOld = new ConverterOld();
        double resultOne = converterOld.fromFahrenheitToCelsius(10);
        double resultTwo = converterOld.fromFahrenheitToKelvin(10);
        check(resultOne == -22.0 && resultTwo == 251.14999999999998, "Test Celsius");
    }


    static void check(boolean result, String taskName) {
        if (result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
