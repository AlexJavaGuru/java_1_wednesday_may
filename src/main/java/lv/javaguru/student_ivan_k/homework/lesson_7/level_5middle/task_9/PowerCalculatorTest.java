package main.java.lv.javaguru.student_ivan_k.homework.lesson_7.level_5middle.task_9;

class PowerCalculatorTest {

    public static void main(String[] args) {
        PowerCalculatorTest runner = new PowerCalculatorTest();
        runner.isExponentation();



    }

     void isExponentation(){
        PowerCalculator powerCalculator = new PowerCalculator();
        double expectedResult = 8;
        double actualResult = powerCalculator.calculationTwo(2,3);
        check(expectedResult,actualResult,"Is Exponentation");

    }

    static void check(double expactedResult,double actualResult, String testName){
        if(expactedResult == actualResult){
            System.out.println(testName + " has been passed.OK!");
        }else {
            System.out.println(testName + " has been failed!!!!!!");
        }
    }

}
