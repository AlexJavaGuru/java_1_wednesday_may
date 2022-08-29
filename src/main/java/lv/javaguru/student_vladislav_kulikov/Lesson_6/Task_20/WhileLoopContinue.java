package lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_20;

class WhileLoopContinue {

    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i % 2 == 0) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
