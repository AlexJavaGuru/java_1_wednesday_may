package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_6_middle;

import java.util.Arrays;

class VarargsExample {
    public static void main(String[] args) {
        testFindBiggestNumber();
        testFindNumbersInRange();
    }

    static int biggestNumber(int... numbers) {
        int biggestNumber = numbers[0];
        for (int number : numbers) {
            if (number > biggestNumber) {
                biggestNumber = number;
            }
        }
        return biggestNumber;
    }

    static int[] findNumberFromTo(int numberFrom, int numberTo, int... numbers) {
        int[] numberArray = new int[0];
        int counter = 0;
        for (int number : numbers) {
            if (number >= numberFrom && number <= numberTo) {
                numberArray = copyMassiveAndMakeLengthPlusOne(numberArray);
                numberArray[counter] = number;
                counter++;
            }

        }
        return numberArray;
    }

    static int[] copyMassiveAndMakeLengthPlusOne(int[] array) {
        return Arrays.copyOf(array, array.length + 1);
    }

    static void testFindNumbersInRange() {
        int[] result = findNumberFromTo(-31, 53, 54, 57, 32, 31, -31, -32, 53, 0, 17);
        int[] expectedResult = {32, 31, -31, 53, 0, 17};
        if (Arrays.equals(result,expectedResult)) {
            System.out.println("Test Find numbers in range Passed");
        } else {
            System.out.println("Test find in range Failed");
        }
    }

    static void testFindBiggestNumber() {
        int result = biggestNumber(-1315, -1214, -183, -1295, -179, -200, -199);
        if (result == -179) {
            System.out.println("TestPassed");
        } else {
            System.out.println("TestFailed");
        }
    }
}
