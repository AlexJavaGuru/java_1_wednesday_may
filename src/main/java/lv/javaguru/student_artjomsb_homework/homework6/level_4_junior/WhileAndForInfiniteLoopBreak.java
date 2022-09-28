package lv.javaguru.student_artjomsb_homework.homework6.level_4_junior;

import java.util.Scanner;

class WhileAndForInfiniteLoopBreak {
    public static void main(String[] args) {
        whileInfiniteBreak();
        infiniteForLoopBreak();
    }
    private static void whileInfiniteBreak() {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.println("Please buy the elephant ");
            if (userInput.next().equals("okay")) {
                break;
            }
        }
    }
    private static void infiniteForLoopBreak(){
        Scanner userInput = new Scanner(System.in);
        for (int i = 0; i == 0 ; i = 0) {
            System.out.println("2 + 2 = ?");
            if (userInput.nextInt() == 5){
                break;
            }
        }
    }
}
