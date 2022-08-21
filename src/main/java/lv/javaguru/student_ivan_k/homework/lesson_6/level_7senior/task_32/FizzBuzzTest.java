package main.java.lv.javaguru.student_ivan_k.homework.lesson_6.level_7senior.task_32;

class FizzBuzzTest {

    public static void main(String[] args) {
        FizzBuzzTest runner = new FizzBuzzTest();
        runner.isFizzBuzz();
        runner.isFizz();
        runner.isBuzz();
        runner.isinitialNumber();











    }
    public void isFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "FizzBuzz";
        String actualResult = fizzBuzz.detect(15);
        check(actualResult,expectedResult,"FizzzBuzz");
    }

    public void isFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Fizz";
        String actualResult = fizzBuzz.detect(9);
        check(actualResult,expectedResult,"Fizz");
    }

    public void isBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "Buzz";
        String actualResult = fizzBuzz.detect(10);
        check("Buzz","Buzz","Buzz");
    }

    public void isinitialNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String expectedResult = "" + 34;
        String actualResult = fizzBuzz.detect(34);
        if(expectedResult.equals(actualResult)){
            System.out.println("Is initial test Has Passed.OK!");
        }else {
            System.out.println("Is initial test Has FAILED!!! ");
        }
    }


    public void check(String expectedResult, String actualResult,String testName){
        if(actualResult == expectedResult){
            System.out.println(testName + " test has PASSED.OK");
        }else {
            System.out.println(testName + " test has FAILED!!!!!");
        }
    }


}
