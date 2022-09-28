package lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_12;

public class ArrayServiceDemo {
    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 100;

        boolean isTrue = arrayService.contains( array ,100);
        arrayService.printResult(isTrue);


    }



}
