package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_12;

class ArrayService {


    public boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (numberToSearch == array[i]) {
                return true;
            }
        }
        return false;
    }

    public void  printResult (boolean isTrue) {
        if (isTrue = true){
            System.out.println("The desired number contains!");

        }

    }
}
