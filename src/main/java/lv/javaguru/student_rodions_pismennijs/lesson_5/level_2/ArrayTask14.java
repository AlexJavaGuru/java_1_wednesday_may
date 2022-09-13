package lv.javaguru.student_rodions_pismennijs.lesson_5.level_2;

import java.util.Arrays;
import java.util.Random;

class ArrayTask14 {

    public static void main(String[] args) {

        int[] numbers = new int[3];

        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(numbers));

        int sum = (numbers[0] + numbers[1] + numbers[2]) / 3;

        System.out.println(sum);
    }
}
