package main.java.lv.javaguru.student_artjomsb_homework.homework3.homework3string;
import java.util.Scanner;
class TheLine {
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
