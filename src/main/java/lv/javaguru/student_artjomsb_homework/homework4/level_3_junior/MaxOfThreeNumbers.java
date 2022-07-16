package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_3_junior;

class MaxOfThreeNumbers {
    int maxOfThreeNumbers(int numOne, int numTwo, int numThree) {
        int[] numbers = {numOne, numTwo, numThree};
        int largestNumber = numOne;
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] < numbers[i + 1]) {
                largestNumber = numbers[i + 1];
            }
        }
        return largestNumber;
    }
}
