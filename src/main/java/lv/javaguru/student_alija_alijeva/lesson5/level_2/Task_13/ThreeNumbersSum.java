package main.java.lv.javaguru.student_alija_alijeva.lesson5.level_2.Task_13;

import java.util.Arrays;
import java.util.Random;

class ThreeNumbersSum {
    public static void main(String[] args){
        int[] num = new int[3];
        Random random = new Random();
        int max = 100;
        num[0] = random.nextInt(max);
        num[1] = random.nextInt(max);
        num[2] = random.nextInt(max);
        System.out.println(Arrays.toString(num));
        System.out.println("Numbers sum is "+ (num[0] + num [1] + num[2]));
    }
}
