package lv.javaguru.teacher.lesson_3_oop_first_look.lessoncode;

public class CalculatorDemo {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.sum(10, 5);

        System.out.println(result - 5);
    }
}
