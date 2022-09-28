package lv.javaguru.student_ivan_k.homework.lesson_6.level_3junior.task_13;


class ArrayServiceTest {
    public static void main(String[] args) {
        ArrayServiceTest runner = new ArrayServiceTest();
        runner.willBeMatch();
        runner.willNotBeMatch();
        runner.chengedNumber();


    }

    public void willBeMatch(){
        ArrayService array = new ArrayService();
        int[] testArray = {2,9,100,70,100};
        int expectedRsult = 2;
        int actualResult = array.numOfOccurOfNum(testArray,100);
        chek(expectedRsult == actualResult,"Will be match");

    }

    public void willNotBeMatch(){
        ArrayService arrayService = new ArrayService();
        int[] testArray = {1,2,3,4,5,6};
        int expectedResult = 0;
        int actualResult = arrayService.numOfOccurOfNum(testArray,100);
        chek(expectedResult == actualResult,"Will Not match");
    }
    public void chengedNumber(){
        ArrayService arrayService = new ArrayService();
        int[] testArray = {2,3,4,7,7,7};
        boolean actualResult = arrayService.replaceFirst(testArray,7,1);
        boolean expectedResult = true;
        chek(actualResult == expectedResult,"Changing NUMBER ");


    }

    private void chek(boolean condition, String nameTest) {
        if(condition){
            System.out.println(nameTest + " test has passed.OK!");
        }else {
            System.out.println(nameTest + " test has Failed!!!");
        }
    }
}
