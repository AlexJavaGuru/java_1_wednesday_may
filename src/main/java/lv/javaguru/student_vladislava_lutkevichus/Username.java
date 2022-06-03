package main.java.lv.javaguru.student_vladislava_lutkevichus;
import java.util.Scanner;

public class Username {
    public static void main(String[] args){
        System.out.println("What's your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        System.out.println("Hello, " + name + "!");
    }
}
