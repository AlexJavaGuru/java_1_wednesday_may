package main.java.lv.javaguru.student_andrei_de.Homework.lesson6;

class FizzBuzz {
    String initialNumber;

    public String detect(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) return "FizzBuzz";
        else if (number % 3 == 0) return "Fizz";
        else if (number % 5 == 0) return "Buzz";
        else return "" + initialNumber;
    }
}
