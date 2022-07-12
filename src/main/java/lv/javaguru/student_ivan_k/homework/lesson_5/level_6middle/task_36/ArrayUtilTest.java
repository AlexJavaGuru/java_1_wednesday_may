package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_6middle.task_36;

class ArrayUtilTest {

    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
        test.shouldFindMaxNumber();
    }

    public void shouldCreateArray() {
        ArrayUtil myArray = new ArrayUtil();
        int[] actualResult = myArray.createArray(10);
        chek(actualResult.length == 10, "Array creating");
    }

    public void shouldFindMaxNumber() {
        ArrayUtil myArray = new ArrayUtil();
        int[] testArray = {2,3,100,99,20};
        int expactedResult = 100;
        int actualResult = myArray.findMaxNumber(testArray);
        chek(actualResult == expactedResult, "Find maximal number");
    }
    private void chek (boolean isPassed, String nameTast){
        if (isPassed){
            System.out.println(nameTast + " is passed.OK!");
        }else {
            System.out.println(nameTast + " is failed!!!!!!!");
        }
    }
}
