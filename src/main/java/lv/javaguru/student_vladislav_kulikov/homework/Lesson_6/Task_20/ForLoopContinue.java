package main.java.lv.javaguru.student_vladislav_kulikov.homework.Lesson_6.Task_20;

class ForLoopContinue {

    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i < 1; i = i++) {
            if (number % 2 == 0) {
                number++;
                continue;
            }
            System.out.println(number);
            number++;
        }
    }
}
