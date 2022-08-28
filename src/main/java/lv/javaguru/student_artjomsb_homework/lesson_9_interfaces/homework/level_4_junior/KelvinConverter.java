package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_4_junior;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}