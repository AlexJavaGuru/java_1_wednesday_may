package lv.javaguru.student_ivan_k.homework.lesson_5.level_4junior.task_28;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumMinVar {
    public static void main(String[] args) {
        Random random = new Random();
        int l = random.nextInt(10);
        int[] variable = new int[l];
        for (int i = 0; i < variable.length; i++) {
            variable[i] = random.nextInt(10);
        }
        System.out.println("Length and array variable have been generated");
        System.out.println("The array is: " + Arrays.toString(variable));

        int min = variable[0];
        for (int i = 0; i < variable.length; i++) {
            if(variable[i] < min){
                min = variable[i];
            }
        }
        System.out.println("Minimal variable is: " + min);


    }
}
