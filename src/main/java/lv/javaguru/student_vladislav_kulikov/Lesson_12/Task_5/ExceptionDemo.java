package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_5;

public class ExceptionDemo extends Exception {

    public static void main(String[] args) {
        int numberOne = 3;
        int numberTwo = 0;

        try {
            double result = numberOne / numberTwo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
