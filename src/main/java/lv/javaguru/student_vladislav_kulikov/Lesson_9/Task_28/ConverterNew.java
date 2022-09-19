package lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_28;

class ConverterNew {


    void convertTemperature(Temperatures temperatures, double temperature) {

        switch(temperatures){
            case FromCelsiusToKelvin -> {
                CelsiusConverter converter1 = new CelsiusConverter();
                System.out.println("From Celsius To Kelvin " + converter1.fromCelsiusToKelvin(temperature));
            }
            case FromCelsiusToFahrenheit -> {
                CelsiusConverter converter1 = new CelsiusConverter();
                System.out.println("From Celsius To Fahrenheit " + converter1.fromCelsiusToFahrenheit(temperature));
            }
            case FromKelvinToCelsius -> {
                KelvinConverter kelvinConverter = new KelvinConverter();
                System.out.println("From Kelvin To Celsius " + kelvinConverter.fromKelvinToCelsius(temperature));
            }
            case FromKelvinToFahrenheit -> {
                KelvinConverter kelvinConverter = new KelvinConverter();
                System.out.println("From Kelvin To Fahrenheit " + kelvinConverter.fromKelvinToFahrenheit(temperature));
            }
            case FromFahrenheitToCelsius -> {
                FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
                System.out.println("From Fahrenheit To Celsius " + fahrenheitConverter.fromFahrenheitToCelsius(temperature));
            }
            case FromFahrenheitToKelvin -> {
                FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
                System.out.println("From Fahrenheit To Kelvin "+ fahrenheitConverter.fromFahrenheitToKelvin(temperature));
            }
        }
    }
}
