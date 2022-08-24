package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_11_to_12;

class FahrenheitConverterTest {

    public static void main(String[] args) {
        fahrenheitConverter();
    }
    static void fahrenheitConverter() {
        FahrenheitConverter fahrenheitConverter = new FahrenheitConverter();
        double result = fahrenheitConverter.convert(28.0);
        check(result == 82.4, " Fahrenheit Converter");
    }

    static void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
