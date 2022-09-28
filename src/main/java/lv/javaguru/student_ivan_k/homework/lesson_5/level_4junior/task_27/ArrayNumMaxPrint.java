package lv.javaguru.student_ivan_k.homework.lesson_5.level_4junior.task_27;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumMaxPrint {
    public static void main(String[] args) {
        int[] varible = new int[3];
        Random random = new Random();
        for (int i = 0; i < varible.length; i++) {
            varible[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(varible));


        int max = varible[0];
        for (int i = 0; i < varible.length ; i++) {
            if(varible[i] > max){
                max = varible[i];
            }
        }
        System.out.println("Maximal variable is: " + max);

    }
}
