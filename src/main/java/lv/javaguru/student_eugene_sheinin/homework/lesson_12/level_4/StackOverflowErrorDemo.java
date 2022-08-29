package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_4;

public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        try {
            someMethod();
        }catch (StackOverflowError e){
            System.out.println("Stack overflow error thrown!");
        }
    }

    private static void someMethod() {
        int someLocalVariable = 1;
        someMethod();
    }
}
