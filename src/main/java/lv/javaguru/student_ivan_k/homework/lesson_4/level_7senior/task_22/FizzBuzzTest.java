package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_7senior.task_22;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest runerTster = new FizzBuzzTest();
        runerTster.fizBuzTest();
        runerTster.fizTest();
        runerTster.BuzzTest();


    }
//    void noFizzBuzz(){
//        FizzBuzz fizzBuzz = new FizzBuzz();
//        String actualResult = fizzBuzz.detect(4);
//        int expectedResult = 4;
//        String str = Integer.toString(expectedResult ,4);
//
//        check(actualResult,expectedResult,"NOFIZZBUZZ test ");
//
//    }
    void BuzzTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(5);
        String expectedResult = "Buzz";
        check(actualResult,expectedResult,"BUZZ test ");
    }

    void fizTest(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String actualResult = fizzBuzz.detect(3);
        String expectedResult = "Fizz";
        check(actualResult,expectedResult,"FIZZ test ");
    }

    void fizBuzTest (){
        FizzBuzz fizzBuzz = new FizzBuzz();
       String actualResult = fizzBuzz.detect(15);
       String expectedResult = "FizzBuzz";
       check(actualResult,expectedResult,"FIZBUZZ test ");

    }
    void check(String actualResult,String expectedResult,String nameOfTest){
        if(actualResult == expectedResult){
            System.out.println(nameOfTest + "is OK!");
        }else {
            System.out.println(nameOfTest + "IS FAIL!!!");
        }
    }
}
