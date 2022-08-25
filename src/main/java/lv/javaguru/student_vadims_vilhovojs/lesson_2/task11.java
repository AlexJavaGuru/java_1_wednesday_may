package lv.javaguru.student_vadims_vilhovojs.lesson_2;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        System.out.println("specify three integers");

        Scanner scanner = new Scanner(System.in);
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();
        int variableC = scanner.nextInt();
        double result = ((variableA + variableB + variableC) / 3) ;

        System.out.println(result);



    }
}
