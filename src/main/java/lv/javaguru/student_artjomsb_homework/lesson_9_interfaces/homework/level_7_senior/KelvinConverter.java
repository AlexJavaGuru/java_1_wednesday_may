package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convertToCelsius(double degree) {
        return degree + 273.15;
    }

    @Override
    public double convertToFahrenheit(double degree) {
        return (degree - 273.15) * 1.8 + 32;
    }

    @Override
    public double convertToKelvin(double degree) {
        return degree;
    }
}