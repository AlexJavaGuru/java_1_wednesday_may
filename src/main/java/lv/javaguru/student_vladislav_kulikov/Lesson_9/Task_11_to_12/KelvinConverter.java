package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_11_to_12;

class KelvinConverter implements TemperatureConverter {

    @Override
    public double convert(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }
}
