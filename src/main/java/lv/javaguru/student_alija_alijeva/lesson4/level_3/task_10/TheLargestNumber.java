package lv.javaguru.student_alija_alijeva.lesson4.level_3.task_10;

import java.util.Scanner;

class TheLargestNumber {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        System.out.println("Your numbers is ");
        int numberOne = numbers.nextInt();
        int numberTwo = numbers.nextInt();
        int numberThree = numbers.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("Number one is the largest");
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("Number two is the largest");
        } else {
            System.out.println("Number three is the largest");
        }
    }
}
