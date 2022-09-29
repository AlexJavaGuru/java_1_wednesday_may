package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_26;

class StackOverflowErrorDemo {

    static void makeStackOverflowErrorDemo() {
        makeStackOverflowErrorDemo();
    }
    public static void main(String[] args) {
        makeStackOverflowErrorDemo();
    }
}
