package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_12_to_17;

class ArrayService {

    boolean findNumberInArray(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int countNumbersInArray(int[] array, int numberToSearch) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                result++;
            }
        }
        return result;
    }

    boolean changeFirstNumberInArray(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
               array[i] = newNumber;
               return true;
            }
        }
        return false;
    }
    int changeAllNumbers(int[] array, int numberToReplace, int newNumber) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                counter++;
            }
        }
        return counter;
    }

    void invertedArray(int[] array) {
        for (int i = 0; i < array.length/2; i++) {
            int tmp = array[i];
            array[i] = array[array.length -i -1];
            array[array.length -i -1] = tmp;
        }
    }

    void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minimum = array[i];
            int smallest = i;

            for (int j = i+1; j < array.length; j++) {
                if (array[j] < minimum) {
                    minimum = array[j];
                    smallest = j;
                }
            }
            if (i!= smallest) {
                int number = array[i];
                array[i] = array[smallest];
                array[smallest] = number;
            }
        }
    }
}

