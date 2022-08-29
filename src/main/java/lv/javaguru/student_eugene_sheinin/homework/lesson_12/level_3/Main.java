package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_3;

class Main {

    public static void main(String args[]) {

        //task 21
        // 1. Will be thrown  in try block
        // 2. Will be caught in catch block with message "Got the Test Exception"
        // 3 .Will be invoked message in finally block "Inside finally block"
        try {
            throw new TestException();
        } catch(TestException t) {
            System.out.println("Got the Test Exception");
        } finally {
            System.out.println("Inside finally block ");
        }
    }
}
