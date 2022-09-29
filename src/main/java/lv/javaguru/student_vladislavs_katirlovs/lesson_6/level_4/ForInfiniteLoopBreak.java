package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_4;

class ForInfiniteLoopBreak {

    public static void main(String[] args) {
        for (int var = 0; var >= 0; var++) {
            System.out.println(var);
            if (var == 10) {
                break;
            }
        }
    }

}
