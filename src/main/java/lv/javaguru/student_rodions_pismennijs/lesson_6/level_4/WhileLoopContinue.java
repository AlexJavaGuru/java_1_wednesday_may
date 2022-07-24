package main.java.lv.javaguru.student_rodions_pismennijs.lesson_6.level_4;

class WhileLoopContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i < 10) {
                i++;
                System.out.println(i);
                continue;
            }
        }
    }
}
