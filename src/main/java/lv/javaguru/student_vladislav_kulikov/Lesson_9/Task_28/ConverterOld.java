package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_28;

class ConverterOld {

    void convert(Temperatures temperature, double degrees) {

        switch (temperature) {
            case Celsius -> {
                System.out.println("From Celsius To Kelvin = " + fromCelsiusToKelvin(degrees));
                System.out.println("From Celsius To Fahrenheit = " + fromCelsiusToFahrenheit(degrees));
            }
            case Kelvin -> {
                System.out.println("From Kelvin To Celsius = " + fromKelvinToCelsius(degrees));
                System.out.println("From Kelvin To Fahrenheit = " + fromKelvinToFahrenheit(degrees));
            }
            case Fahrenheit -> {
                System.out.println("From Fahrenheit To Celsius = " + fromFahrenheitToCelsius(degrees));
                System.out.println("From Fahrenheit To Kelvin = " + fromFahrenheitToKelvin(degrees));
            }
        }
    }

     double fromCelsiusToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

     double fromCelsiusToFahrenheit(double celsiusTemperature) {
        int number = 9 / 5;
        return celsiusTemperature * number + 32;
    }

     double fromKelvinToCelsius(double kelvinTemperature) {
        return kelvinTemperature - 273.15;
    }

     double fromKelvinToFahrenheit(double kelvinTemperature) {
        int number = 9 / 5;
        return kelvinTemperature - 273.15 * number + 32;
    }

     double fromFahrenheitToCelsius(double fahrenheitTemperature) {
        int number = 9 / 5;
        return fahrenheitTemperature - 32 * number;
    }

     double fromFahrenheitToKelvin(double fahrenheitTemperature) {
        int number = 9 / 5;
        return fahrenheitTemperature - 32 * number + 273.15;
    }

}
