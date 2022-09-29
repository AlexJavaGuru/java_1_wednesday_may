package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_6.level_3;

class ArrayService {

    boolean contains(int[] array, int numberToSearch) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                return true;
            }
        }
        return false;
    }

    int specNumberCount(int[] array, int numberToSearch) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToSearch) {
                count = count + 1;
            }
        }
        return count;
    }

    boolean replaceFirst(int[] array, int numberToReplace, int newNumber) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                return true;
            }
        }
        return false;
    }

    int replaceAll(int[] array, int numberToReplace, int newNumber) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberToReplace) {
                array[i] = newNumber;
                count = count + 1;
            }
        }
        return count;
    }

    int[] revert(int[] array) { //просидел долгое время, вообще не понял, как это сделать
        int temp;               //через void и без return, тесты отказываются запускаться
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

}
