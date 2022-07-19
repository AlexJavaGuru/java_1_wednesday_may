package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_2.Task_14;

import java.util.Arrays;
import java.util.Random;

class ThreeNumbersAverage {
    public static void main(String[] args){
        int[] numbers = new int[3];
        Random random = new Random();
        int max = 100;
        numbers[0] = random.nextInt(max);
        numbers[1] = random.nextInt(max);
        numbers[2] = random.nextInt(max);
        double average = (numbers[0] + numbers[1] + numbers[2])/3;
        System.out.println(Arrays.toString(numbers));
        System.out.println("Average is " + average);
    }
}
