package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

class IncreasingNumbers {
    String increasingNumber(int numOne, int numTwo, int numThree) {
        int[] numbers = {numOne, numTwo, numThree};
        String result = "Neither increasing or decreasing order";
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 0; i < numbers.length - 1; i++) {
            isIncreasing = numbers[i] < numbers[i + 1] && isIncreasing;
        }
        for (int k = 0; k < numbers.length - 1; k++) {
            isDecreasing = numbers[k] > numbers[k + 1] && isDecreasing;
        }
        if (isIncreasing && !isDecreasing) {
            result = "increasing";
        }
        if (!isIncreasing && isDecreasing) {
            result = "decreasing";
        }
        return result;
    }
}
