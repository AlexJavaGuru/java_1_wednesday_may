package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_13;

public class ArrayServiceDemo {

    public static void main(String[] args) {
        ArrayService arrayService = new ArrayService();

        int[] array = new int[6];
        array[0] = 1;
        array[1] = 2;
        array[2] = 100;
        array[3] = 100;
        array[4] = 100;
        array[5] = 1;

        boolean isfound = arrayService.contains(array,100);
        arrayService.printResultofFounding(isfound);
        int xNum = arrayService.numOfOccurOfNum(array,99);
        System.out.println("Number occurrences " + xNum +" times!");





    }
}
