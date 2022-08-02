package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; true; i++) {
            System.out.println("Infinite");
            break;
        }
    }
}
