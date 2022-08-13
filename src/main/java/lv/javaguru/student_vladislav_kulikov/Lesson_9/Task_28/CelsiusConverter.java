package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_28;

class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature;
    }

    double fromCelsiusToKelvin(double celsiusTemperature) {
        int number = 9 / 5;
        double resultOne = celsiusTemperature + 273.15;
        return resultOne;
    }

    double fromCelsiusToFahrenheit(double celsiusTemperature) {
        int number = 9 / 5;
        double resultTwo = celsiusTemperature * number + 32;
        return resultTwo;
    }
}
