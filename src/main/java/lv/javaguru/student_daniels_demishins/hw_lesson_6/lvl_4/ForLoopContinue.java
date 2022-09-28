package lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_4;

public class ForLoopContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(" i = " + i);
        }
    }
}

