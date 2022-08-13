package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_28;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    double fromKelvinToCelsius(double kelvinTemperature) {
        double resultOne = kelvinTemperature - 273.15;
        return resultOne;
    }

    double fromKelvinToFahrenheit(double kelvinTemperature) {
        int number = 9 / 5;
        double resultTwo = kelvinTemperature - 273.15 * number + 32;
        return resultTwo;
    }

}
