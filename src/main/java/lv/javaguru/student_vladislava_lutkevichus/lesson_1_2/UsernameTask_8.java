package lv.javaguru.student_vladislava_lutkevichus.lesson_1_2;
import java.util.Scanner;

public class UsernameTask_8 {
    public static void main(String[] args){
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");
    }
}
