package main.java.lv.javaguru.student_ivan_k.homework.lesson_4.level_7senior.task_22;

class FizzBuzz {

    public String detect(int number){
        int varA = 3;
        int varB = 5;
        int result1 = number % varA;
        int result2 = number % varB;
        if (result1 == 0 && result2 == 0){
            return "FizzBuzz";
        }else if(result1 == 0 ){
            return "Fizz";
        } else if ( result2 ==0) {
            return "Buzz";
        }
        return "" + number;

    }
}
