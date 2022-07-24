package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_4junior.task_20;

public class WhileLoopContinue {


    public static void main(String[] args) {

        int i = 0;
        while (i < 10) {
            if(i ==3){
                break;
            }
            System.out.print("i = " + i + "; ");
            i++;
        }
    }
}

