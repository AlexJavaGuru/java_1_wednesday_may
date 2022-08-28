package lv.javaguru.student_vladislavs_katirlovs.lesson_4.level_2;

import java.util.Scanner;

class Task5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type 2 variables...");
        int variableA = scanner.nextInt();
        int variableB = scanner.nextInt();

        String result;

        if (variableA > variableB) {
            result = variableA + " is the biggest";
        } else if (variableB > variableA){
            result = variableB + " is the biggest";
        } else {
            result = "Variables are similar";
        }

        System.out.println(result);
    }
}
