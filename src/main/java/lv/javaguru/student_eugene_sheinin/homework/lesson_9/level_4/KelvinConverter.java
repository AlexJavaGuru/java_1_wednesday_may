package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_9.level_4;

public class KelvinConverter implements TemperatureConverter{

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
