package lv.javaguru.teacher.lesson_2_variables.lesoncode;

public class VariablesDemo {

    public static void main(String[] args) {
        int age = 20;
        boolean isHungry = false;

        isHungry = true;
        System.out.println(isHungry);
        isHungry = false;
        System.out.println(isHungry);

        double variableA = 10.5;
        double variableB = 5.5;
        double result = variableA + variableB;

        System.out.println(result);

        String firstName = "Alex";

        char symbol = 'G';

        int x = 42;
        int y = 4;
        double resultTwo = x / (double) y;
        System.out.println(resultTwo);

        System.out.println((int) symbol);

        System.out.println((char) x);
    }
}
