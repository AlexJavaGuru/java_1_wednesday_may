package lv.javaguru.teacher.lesson_2_variables.lesoncode;

public class WritingToConsoleDemo {

    public static void main(String[] args) {
        String word = "Hello";
        System.out.println(word);

        System.out.println(10 + 5);

        int x = 42;
        int y = 4;
        int sum = x + y;
        int ded = x - y;
        int mult = x * y;
        double div = x / (double) y;

        System.out.println("Sum of numbers " + x + " and " + y + " = " + sum);
    }
}
