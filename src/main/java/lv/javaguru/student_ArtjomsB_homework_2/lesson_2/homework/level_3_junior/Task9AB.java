package main.java.lv.javaguru.student_ArtjomsB_homework_2.lesson_2.homework.level_3_junior;
import java.util.Scanner;

public class Task9AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //Input the number
        System.out.print("Please,enter the number:");
        int num = inp.nextInt();
        //Cycle "For" output multiplication table from 1 to 10
        for(int i=1; i<11; i++){
            System.out.println(num + " * "  + i + " = " + (num*i) );
        }
    }
}
