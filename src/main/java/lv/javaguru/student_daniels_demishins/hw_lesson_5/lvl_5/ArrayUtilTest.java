package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_5.lvl_5;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtilTest test = new ArrayUtilTest();
        test.shouldCreateArray();
    }

    public void shouldCreateArray(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(10);
        if(result.length ==10){
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }

    public void shouldFindMaxNumber(){
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] result = arrayUtil.createArray(10);

    }

}
