package main.java.lv.javaguru.teacher.lesson_6_arrays_while_loop.lessoncode;

public class BranchingStatements {

    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.print("i = " + i + "; ");
            i++;
        }
    }
}
