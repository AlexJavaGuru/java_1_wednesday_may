package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_6middle.task_38;

class ArrayUtilTest {

    public static void main(String[] args) {

        ArrayUtilTest arrayUtilTest = new ArrayUtilTest();
        arrayUtilTest.shouldCreateArray();
        arrayUtilTest.shouldFindMaxNumber();
        arrayUtilTest.shouldFindMinNumber();

    }


    public void shouldCreateArray() {
        ArrayUtil myArray = new ArrayUtil();
        int[] actualResult = myArray.createArray(10);
        chek(actualResult.length == 10, "Array creating ");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil myArray = new ArrayUtil();
        int[] testArray = {2,3,4,5,6,7,8};
        int expectedResult = 8;
        int actualResult = myArray.findMaxNumber(testArray);
        chek(expectedResult == actualResult, "Finded maximal number");
    }

    public void shouldFindMinNumber() {
        ArrayUtil myArray = new ArrayUtil();
        int[] testArray ={9,8,7,6,5,4};
        int expectedResult = 4;
        int actualResult = myArray.findMinNumber(testArray);
        chek(actualResult == expectedResult, "Finded minimal number");
    }

    private void chek (boolean isPassed, String nameTast){
        if (isPassed){
            System.out.println(nameTast + " is passed.OK!");
        }else {
            System.out.println(nameTast + " is failed!!!!!!!");
        }
    }
}
