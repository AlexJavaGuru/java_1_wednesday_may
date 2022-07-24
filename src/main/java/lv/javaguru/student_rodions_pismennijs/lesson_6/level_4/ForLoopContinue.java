package main.java.lv.javaguru.student_rodions_pismennijs.lesson_6.level_4;

class ForLoopContinue {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; true; i++) {
            if (number % 2 == 0) {
                number++;
                System.out.println(number);
                continue;
            }
        }
    }
}
