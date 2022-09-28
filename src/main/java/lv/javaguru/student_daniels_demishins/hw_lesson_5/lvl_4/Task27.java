package lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_4;


import java.util.Random;
import java.util.Scanner;

public class Task27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите длинну массива");
        int numbers = scanner.nextInt();
        int array[] = new int[numbers];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(5);
        }

        System.out.println("Случайно сгенерированные элементы массива");
        for (int i = 0; i < array.length; i++) {
            System.out.println(" " + array[i]);
        }

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальное число = " + max);
    }
}