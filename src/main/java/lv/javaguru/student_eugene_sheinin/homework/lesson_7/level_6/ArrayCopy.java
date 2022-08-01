package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_7.level_6;

class ArrayCopy {

    int[] copyInRange(int[] in, int numberFrom, int numberTo) {

        int[] newArray = new int[this.getFilteredNumberCount(in, numberFrom, numberTo)];
        int newArrayIndex = 0;
        for(int i = 0; i < in.length; i++) {
            if(in[i] >= numberFrom && in[i] <=numberTo) {
                newArray[newArrayIndex++] = in[i];
            }
        }

        return newArray;
    }

    private int getFilteredNumberCount(int[] in, int numberFrom, int numberTo) {
        int filteredCount = 0;
        for(int i = 0; i < in.length; i++) {
            if(in[i] >= numberFrom && in[i] <=numberTo) {
                filteredCount++;
            }
        }

        return filteredCount;
    }
}
