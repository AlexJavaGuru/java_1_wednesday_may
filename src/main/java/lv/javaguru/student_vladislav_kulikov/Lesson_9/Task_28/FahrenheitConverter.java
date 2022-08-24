package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_28;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return  1.8 * celsiusTemperature + 32;
    }

    double fromFahrenheitToCelsius(double fahrenheitTemperature) {
        int number = 9/5;
        double resultOne = fahrenheitTemperature - 32 * number;
        return resultOne;
    }

    double fromFahrenheitToKelvin(double fahrenheitTemperature) {
        int number = 9/5;
        double resultTwo = fahrenheitTemperature - 32 * number + 273.15;
        return resultTwo;
    }
}
