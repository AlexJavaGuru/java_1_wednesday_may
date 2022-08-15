package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_4;

public class FahrenheitConverter implements TemperatureConverter{

    public double convert(double celsiusTemperature) {
        return 1.8 * celsiusTemperature + 32;
    }
}
