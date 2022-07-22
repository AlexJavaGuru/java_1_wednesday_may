package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_4;

import java.util.Scanner;

class task_3 {
    public static void main(String[] args) {
        System.out.println("Specify integer from 1 till 7");
        Scanner scanner = new Scanner(System.in);
        int variableNumber = scanner.nextInt();
        System.out.println("Number - " + variableNumber);
        if (variableNumber == 1 ) {
            System.out.println("Day of the week - Monday ");
        } else if (variableNumber == 2 ) {
            System.out.println("Day of the week - Tuesday ");
        } else if (variableNumber == 3 ) {
            System.out.println("Day of the week - Wednesday");
        } else if (variableNumber == 4 ) {
            System.out.println("Day of the week - Thursday");
        } else if (variableNumber == 5 ) {
            System.out.println("Day of the week - Friday");
        } else if (variableNumber == 6 ) {
            System.out.println("Day of the week - Saturday");
        } else if (variableNumber == 7 ) {
            System.out.println("Day of the week - Sunday");
        }




    }

}
