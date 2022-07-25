package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_2intern.task_15;

public class ArrayThrePlusTwo {
    public static void main(String[] args) {


        int[] numbers = {11, 9, 2};
        for (int num : numbers) {
            System.out.println(num);
        }
        for (int i = 2; i < 3; i++){
            numbers[0] += i;
            numbers[1] += i;
            numbers[2] += i;
        }

        System.out.println("*************************");
        for (int num : numbers) {
            System.out.println(num);
        }

    }
}

