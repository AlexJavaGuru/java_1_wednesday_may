package main.java.lv.javaguru.student_artjomsb_homework.homework6.level_7_senior;

class FizzBuzz {

    private int initialNumber;

    private String fizzBuzz;

    void detect() {
        if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0)) {
            fizzBuzz = "FizzBuzz";
        } else if (initialNumber % 3 == 0) {
            fizzBuzz = "Fizz";
        } else if (initialNumber % 5 == 0) {
            fizzBuzz = "Buzz";
        } else {
            fizzBuzz = "" + initialNumber;
        }
    }

    public void setInitialNumber(int initialNumber) {
        this.initialNumber = initialNumber;
    }

    public String getFizzBuzz() {
        return fizzBuzz;
    }

}

