package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_7_senior;

class FizzBuzz {

    String detect(int number) {
        String result = "" + number;
        if (number % 3 == 0 && number % 5 != 0) {
            result = "Fizz";
        } else if (number % 3 != 0 && number % 5 == 0) {
            result = "Buzz";
        } else if (number % 3 == 0) {
            result = "FizzBuzz";
        }
        return result;
    }

}