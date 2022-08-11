package main.java.lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_7_senior;

class TemperatureConvertorDemo {
    public static void main(String[] args) {
        Degree celsius = new Degree(new CelsiusConverter());
        System.out.println("Celsius to Kelvin - " + celsius.convert("Kelvin", -173.15));
        System.out.println("Celsius to Celsius - " + celsius.convert("Celsius", -173.15));
        System.out.println("Celsius to Fahrenheit - " + celsius.convert("Fahrenheit", -173.15));
        System.out.println("Wrong degree - " + celsius.convert("Fahrenheitt", -173.15));

        System.out.println();

        Degree kelvin = new Degree(new KelvinConverter());
        System.out.println("Kelvin to Kelvin - " + kelvin.convert("Kelvin", 253));
        System.out.println("Kelvin to Celsius - " + kelvin.convert("Celsius", 173.85));
        System.out.println("Kelvin to Fahrenheit - " + kelvin.convert("Fahrenheit", 273.15));
        System.out.println("Wrong degree - " + kelvin.convert("Fahrenheitt", 3173.15));

        System.out.println();

        Degree fahrenheit = new Degree(new FahrenheitConverter());
        System.out.println("Fahrenheit to Kelvin - " + fahrenheit.convert("Kelvin", -173.15));
        System.out.println("Fahrenheit to Celsius - " + fahrenheit.convert("Celsius", -173.15));
        System.out.println("Fahrenheit to Fahrenheit - " + fahrenheit.convert("Fahrenheit", -173.15));
        System.out.println("Wrong degree - " + fahrenheit.convert("Fahrenheitt", -173.15));
    }
}
