package lv.javaguru.student_alija_alijeva.lesson2.homework.level_3.task_9;

import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number: ");
        int num = scanner.nextInt();
       for (int i = 1; i <= 10; i++){
           System.out.println(num + "*" + i + "=" + (num*i));
       }

    }
}
