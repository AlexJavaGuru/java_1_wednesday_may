package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_4_junior;

class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
