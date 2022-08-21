package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_9.Task_11_to_12;

class KelvinConverterTest {

    public static void main(String[] args) {
        kelvinConverter();
    }

    static void kelvinConverter(){
        KelvinConverter kelvinConverter = new KelvinConverter();
        double result = kelvinConverter.convert(28.0);
        check(result == 301.15, "Kelvin Converter");
    }
    static void check(boolean result, String taskName) {
        if(result) {
            System.out.println(taskName + " = OK");
        } else {
            System.out.println(taskName + " = FAILED");
        }
    }
}
