package lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_4;

public class WhileInfiniteLoop {


    public static void main(String[] args) {
        //tasks 17, 18, 19, 20
        int i = 0;
        while (true) {
            System.out.println("infinite loop " + (i++) + " iteration");

            if(i < 3) {
                continue;
            }

            break;
        }
    }
}
