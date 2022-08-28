
package lv.javaguru.student_vladislav_kulikov.Lesson_2;

import java.util.Scanner;

public class Lesson2_Task9 {

    public static void main(String[] args) {

        System.out.println("Enter your number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int a = 1;

        while (a < 11){
            int c = num * a;
            System.out.println(c);
            a++;
        }
    }
}
