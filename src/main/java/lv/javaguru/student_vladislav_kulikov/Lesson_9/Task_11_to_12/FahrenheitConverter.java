package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_11_to_12;


class FahrenheitConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
