package lv.javaguru.student_vladislav_kulikov.Lesson_6.Task_32;

class FizzBuzz {

    public String detect(int number) {
        String result = "";
        if (number % 3 == 0 && number % 5 == 0) {
            result = "FizzBuzz";
        } else if (number % 3 == 0) {
            result = "Fizz";
        } else if (number % 5 == 0) {
            result = "Buzz";
        } else {
            result =  "" + number;
        }
        return result;
    }
}

