package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_4.lvl_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int a = scanner.nextInt();

        switch (a) {
            case 1: System.out.println("Понедельник");break;
            case 2: System.out.println("Вторник");break;
            case 3: System.out.println("Срела");break;
            case 4: System.out.println("Четверг");break;
            case 5: System.out.println("Пятница");break;
            case 6: System.out.println("Суббота");break;
            case 7: System.out.println("Воскресенье");break;
            default:System.out.println("Нет данной опции");
        }
    }
}