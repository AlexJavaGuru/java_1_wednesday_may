package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_6.lvl_4;

public class WhileLoopContinue {
    public static void main(String[] args) {
        int number = 0;
        while (number <10) {
            number++;
            if(number % 2== 0){
                continue;
            }
            System.out.println(" i = " + number);
        }
    }
}
