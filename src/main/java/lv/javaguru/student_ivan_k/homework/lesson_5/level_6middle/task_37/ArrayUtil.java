package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_6middle.task_37;

class ArrayUtil {

    public int findMinNumber(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}