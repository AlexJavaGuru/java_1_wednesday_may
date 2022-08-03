package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_4;

public class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; i >= 0; i++) {
            if (i == 3) {
                break;
            }
            System.out.print("Hello ");
        }
    }
}
