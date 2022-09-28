package lv.javaguru.student_artjomsb_homework.lesson_7.homework.level_5_middle;

class PowerCalculatorDemo {
    public static void main(String[] args) {
        PowerCalculator calculator = new PowerCalculator();
        calculator.askUserNumber();
        calculator.askUserDegree();
        calculator.exponentiation();
        System.out.println(calculator.getNumberToThePower());
    }
}
