package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_5.task_21;

class DogFour {
    String dogName;
    int dogAge;
    String dogColour;

    public DogFour(String dogName, int dogAge, String dogColour) {
        this.dogName = dogName;
        this.dogAge = dogAge;
        this.dogColour = dogColour;
    }

    void voice() {
        System.out.println(dogName + " " + dogAge + " " + dogColour);
    }
}
