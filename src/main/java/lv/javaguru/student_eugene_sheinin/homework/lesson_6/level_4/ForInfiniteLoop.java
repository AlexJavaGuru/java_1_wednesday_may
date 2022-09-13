package lv.javaguru.student_eugene_sheinin.homework.lesson_6.level_4;

public class ForInfiniteLoop {

    public static void main(String[] args) {
        //tasks 17, 18, 19, 20
        for (int i = 0; true; i++ ) {
            System.out.println("infinite loop " + (i++) + " iteration");
            //task 20
            if(i < 3) {
                continue;
            }
            //task 18
            break;
        }
    }
}
