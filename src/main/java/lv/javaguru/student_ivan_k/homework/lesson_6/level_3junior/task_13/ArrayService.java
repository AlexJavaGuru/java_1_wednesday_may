package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_13;

public class ArrayService {

    public boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (numberToSearch == array[i]) {
                return true;
            }
        }
        return false;
    }

    public void printResultofFounding(boolean isFound) {
        if (isFound == true) {
            System.out.println("The desired number contains!");
        } else {
            System.out.println("The desired number is NOT contains!!!!");
        }
    }

    public int numOfOccurOfNum(int[] array, int numOfSearch) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numOfSearch) {
                counter++;
            }
        }
        return counter;
    }
}