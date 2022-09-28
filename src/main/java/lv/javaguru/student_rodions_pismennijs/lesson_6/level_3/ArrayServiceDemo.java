package lv.javaguru.student_rodions_pismennijs.lesson_6.level_3;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 2, 3, 4, 5, 3, 4, 3, 5, 3, 6, 3, 7};
        System.out.println(Arrays.toString(array));
        arrayService.replaceFirst(array, 3, 6);
        System.out.println(Arrays.toString(array));

        boolean a = arrayService.findNumber(array, 3);
        System.out.println(a);

        int b = arrayService.countNumbers(array, 3);
        System.out.println(b);

        arrayService.replaceAll(array, 3, 8);
        System.out.println(Arrays.toString(array));

        arrayService.revert(array);
        System.out.println(Arrays.toString(array));

        arrayService.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
