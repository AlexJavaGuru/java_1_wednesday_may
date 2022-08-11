package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

class Degree {
    private TemperatureConverter temperatureConverter;

    public Degree(TemperatureConverter temperatureConverter) {
        this.temperatureConverter = temperatureConverter;
    }

    public String convert(String toDegree, double degree) {
        return temperatureConverter.convert(toDegree, degree);
    }
}
