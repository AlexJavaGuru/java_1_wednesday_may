package main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_5middle.task_31;

public class ArrayUtilTest {

        public static void main(String[] args) {
            ArrayUtilTest test = new ArrayUtilTest();
            test.shouldCreateArray();
        }

        public void shouldCreateArray() {
          main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_5middle.task_31.ArrayUtil arrayUtil = new main.java.lv.javaguru.student_ivan_k.homework.lesson_5.level_5middle.task_31.ArrayUtil();
          int[] result = arrayUtil.createArray(10);
            chek(result.length == 10,"Array created");
        }

    private void chek(boolean isPassed,String nameTest) {
        if(isPassed){
            System.out.println(nameTest + " test have been PASS.OK!");
        }else {
            System.out.println(nameTest + " test have been FAIL");
        }
    }

}
