package lv.javaguru.student_alija_alijeva.lesson3.homework.level_5.task_22;

class DogFive {
    String dogName;
    int dogAge;
    String dogColour;

    public DogFive(String dogName, int dogAge, String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    void voice() {
        System.out.println(dogName + " " + dogAge + " " + dogColour);
    }

    void changeColor() {
        this.dogColour = "White";

    }
}
