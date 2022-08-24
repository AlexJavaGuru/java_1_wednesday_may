package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_4.Task_22;

public class FizzBuzz {

    public String detect(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        } else {
            return "" + number;
        }
    }
}

