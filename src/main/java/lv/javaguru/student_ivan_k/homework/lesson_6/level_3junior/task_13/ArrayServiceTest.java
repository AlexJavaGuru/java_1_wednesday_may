package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_13;


class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest runner = new ArrayServiceTest();
        runner.willBeMatch();


    }

    public void willBeMatch(){
        ArrayService array = new ArrayService();
        int[] testArray = {2,9,100,70,100};
        int expectedRsult = 2;
        int actualResult = array.numOfOccurOfNum(testArray,100);
        chek(expectedRsult,actualResult,"Will be match");

    }

    private void chek(int expactedResult,int actualResult, String nameTest) {
        if(actualResult == expactedResult){
            System.out.println(nameTest + " test has passed.OK!");
        }else {
            System.out.println(nameTest + " test has Failed!!!");
        }
    }
}
