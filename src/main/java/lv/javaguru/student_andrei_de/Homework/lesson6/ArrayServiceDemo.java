package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

import java.util.Arrays;

class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();
        int[] array = {1,4,3,3,1,3,5,3,2,4,5};
        System.out.println(Arrays.toString(array));
        arrayService.replaceFirst(array, 1 ,5);
        System.out.println(Arrays.toString(array));

        boolean a = arrayService.findNumber(array, 1);
        System.out.println(a);

        int b = arrayService.countNumbers(array,2);
        System.out.println(b);

        arrayService.replaceAll(array, 2,4);
        System.out.println(Arrays.toString(array));

        arrayService.revert(array);
        System.out.println(Arrays.toString(array));

        arrayService.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
