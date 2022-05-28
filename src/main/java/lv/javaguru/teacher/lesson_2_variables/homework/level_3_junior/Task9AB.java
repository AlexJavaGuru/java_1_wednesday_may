package main.java.lv.javaguru.teacher.lesson_2_variables.homework.level_3_junior;
import java.util.Scanner;
public class Task9AB {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Vvdite chislo:");
        int num = inp.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(num + "*" + i + "=" + (num*i) );
        }
    }
}
