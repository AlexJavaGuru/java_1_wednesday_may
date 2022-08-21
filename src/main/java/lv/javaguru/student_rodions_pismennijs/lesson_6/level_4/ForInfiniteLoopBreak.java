package main.java.lv.javaguru.student_rodions_pismennijs.lesson_6.level_4;

class ForInfiniteLoopBreak {
    public static void main(String[] args) {
        for (int i = 0; true; i++) {
            System.out.println("Infinite");
            break;
        }
    }
}
