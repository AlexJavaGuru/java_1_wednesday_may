package lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_13;

import java.util.Arrays;

public class ArrayService {

    public boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (numberToSearch == array[i]) {
                return true;
            }
        }
        return false;
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

    boolean replaceFirst(int[] arr, int numberToReplace, int newNumber) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAllSamNum(int[] arr, int numberToReplace, int newNumber) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == numberToReplace) {
                arr[i] = newNumber;
            }
        }
        return numberToReplace;
    }

    void revert(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
    }

     void sort (int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = arr.length - 1; j > i; j--){
                if (arr[j - 1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
