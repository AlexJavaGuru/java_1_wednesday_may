package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_6.level_4;

class ForLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        for (i = 0; true; i++) {
            if ((i & 2) == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
