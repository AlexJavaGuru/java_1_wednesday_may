package lv.javaguru.student_vadims_vilhovojs.lesson_5;

class ArrayUtilsTest {
    public static void main(String[] args) {
        ArrayUtilsTest test = new ArrayUtilsTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
        test.shouldFindMinNumber();
    }

    public void shouldCreateArray() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] result = arrayUtils.createArray(10);
        if (result.length == 10) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void shouldFindMaxNumber() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = {2, 5, 6, 7};
        int expectedResult = 7;
        int actualResult = arrayUtils.findMaxNumber(array);
        if (actualResult == 7) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    public void shouldFindMinNumber() {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] array = {26, 70, 2, 1, 9};
        int expectedResult = 1;
        int actualResult = arrayUtils.findMinNumber(array);
        if (actualResult == 1) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

}
