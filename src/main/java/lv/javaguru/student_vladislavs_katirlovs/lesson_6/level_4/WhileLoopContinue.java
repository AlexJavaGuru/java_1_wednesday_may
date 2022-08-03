package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_4;

class WhileLoopContinue {

    public static void main(String[] args) {
        int var = 0;
        while (var >= 0) {
            var = var + 1;
            System.out.println(var);
            if (var < 10) {
                continue;
            } break;
        }
    }

}
