package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

class CelsiusConverter implements TemperatureConverter {

    @Override
    public double convertToCelsius(double degree) {
        return degree;
    }

    @Override
    public double convertToFahrenheit(double degree) {
        return degree * 1.8 + 32;
    }

    @Override
    public double convertToKelvin(double degree) {
        return degree + 273.15;
    }
}