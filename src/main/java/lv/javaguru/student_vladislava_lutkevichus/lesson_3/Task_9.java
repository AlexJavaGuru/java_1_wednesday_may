package lv.javaguru.student_vladislava_lutkevichus.lesson_3;
import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Username: ");

        String userName = scanner.nextLine();
        System.out.println("Hello " + userName + "!");
    }
}
