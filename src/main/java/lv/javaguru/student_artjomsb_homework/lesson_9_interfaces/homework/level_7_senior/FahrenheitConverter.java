package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convertToCelsius(double degree) {
        return (degree - 32) / 1.8;
    }

    @Override
    public double convertToFahrenheit(double degree) {
        return degree;
    }

    @Override
    public double convertToKelvin(double degree) {
        return (degree - 32) / 1.8 + 273.15;
    }
}
