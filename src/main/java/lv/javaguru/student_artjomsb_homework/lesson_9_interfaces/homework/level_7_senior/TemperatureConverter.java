package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

interface TemperatureConverter {
    default String convert(String toDegree, double degree) {
        return switch (toDegree) {
            case "Celsius" -> "" + convertToCelsius(degree);
            case "Kelvin" -> "" + convertToKelvin(degree);
            case "Fahrenheit" -> "" + convertToFahrenheit(degree);
            default -> "Error!";
        };
    }

    double convertToCelsius(double degree);

    double convertToFahrenheit(double degree);

    double convertToKelvin(double degree);
}
