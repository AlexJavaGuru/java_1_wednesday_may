package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_19;

class ForInfiniteLoopBreak {

    public static void main(String[] args) {
        for (int i = 0; i < 1; i = i++) {
            System.out.println(1);
            break;
        }
    }
}
