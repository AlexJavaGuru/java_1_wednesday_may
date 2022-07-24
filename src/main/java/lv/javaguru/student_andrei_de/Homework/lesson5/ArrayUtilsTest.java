package main.java.lv.javaguru.student_andrei_de.Homework.lesson5;

class ArrayUtilsTest {

    public static void main(String[] args) {

        ArrayUtilsTest test = new ArrayUtilsTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        ArrayUtils arrayUtils = new ArrayUtils();
       int [] result =  arrayUtils.createArray(10);
        check(result.length == 10, "Array creation");
    }

    public void shouldFindMaxNumber(){
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] testArray = {1, 6, 20, 15, 75, 35, 13};
        int expectedResult = 75;
        arrayUtils.findMaxNumber(testArray);
        int actualResult = arrayUtils.findMaxNumber(testArray);
        check(expectedResult == actualResult, "Find Max");
    }
    public void shouldFindMinNumber(){
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] testArray = {12,24,5,49,72,4,36};
        int expectedResult = 4;
        arrayUtils.findMinNumber(testArray);
        int actualResult = arrayUtils.findMinNumber(testArray);
        check(expectedResult == actualResult, "Find Min");
    }


    private void check(boolean isPassed, String testName) {
        if (isPassed) {
            System.out.println(testName + " Test passed");
        } else {
            System.out.println(testName + " Test failed");
        }
    }

}