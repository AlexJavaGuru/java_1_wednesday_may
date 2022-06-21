package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

public class IncreasingNumbers {
    String increasingNumber (int numOne,int numTwo, int numThree){
        int[] numbers = {numOne, numTwo, numThree};
        String result = "";
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < numbers.length - 1; i++){
            if (numbers[i] < numbers[i+1] && isIncreasing) {
                isIncreasing = true;
            } else isIncreasing = false;
        }
        for(int k = 0; k < numbers.length - 1;k++){
            if (numbers[k]> numbers[k+1] && isDecreasing ) {
                isDecreasing = true;

            } else isDecreasing = false;
        }
        return result;
    }
}
