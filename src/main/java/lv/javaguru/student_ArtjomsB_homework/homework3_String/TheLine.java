package main.java.lv.javaguru.student_ArtjomsB_homework.homework3_String;
import java.util.Scanner;
public class TheLine {
    public static void main(TheLine[] args) {
        Scanner input = new Scanner(System.in);

        String name = "Artjoms";
        String userName = "Artjom";

        System.out.println("My name:" + name);
        System.out.println("Hello " + userName + "!");

        System.out.print("Enter username: ");
        userName = input.nextLine();
        System.out.println("Hey, " + userName + ", Welcome!");
    }
}
