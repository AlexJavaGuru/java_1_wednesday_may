package lv.javaguru.student_ivan_k.homework.lesson_5.level_4junior.task_30;

import java.util.Arrays;
import java.util.Random;

public class ArrayNumNotEven {

    public static void main(String[] args) {
        int[] varible = new int[3];
        Random random = new Random();
        for (int i = 0; i < varible.length; i++) {
            varible[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(varible));


        for (int i = 0; i < varible.length ; i++) {
            if(varible[i] % 2 != 0 ){
                System.out.println(" The not even num is: " + varible[i]);
            }
        }

    }
}
