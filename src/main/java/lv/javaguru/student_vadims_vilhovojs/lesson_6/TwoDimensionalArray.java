package lv.javaguru.student_vadims_vilhovojs.lesson_6;

import java.util.Arrays;

class TwoDimensionalArray {
    public static void main(String[] args) {
        TwoDimensionalArrayUtils twoDimensionalArrayUtils = new TwoDimensionalArrayUtils();

        int [][] arr = new int[3][3];
        twoDimensionalArrayUtils.fillArrayWithRandomNumbers(arr);
        twoDimensionalArrayUtils.sumOffTwoDimensionArray(arr);


    }

}
