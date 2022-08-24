package lv.javaguru.student_alija_alijeva.lesson3.homework.level_5.task_20;

class ThirdDog {

    String dogName;
    int dogAge;

    public ThirdDog(String dogName, int dogAge) {
        this.dogName = dogName;
        this.dogAge = dogAge;
    }

    void voice() {
        System.out.println(dogName + " " + dogAge);
    }

    void happyBirthday() {
        System.out.println((dogAge + 1));
    }

    public void setDogAge(int dogAge) {
        this.dogAge = dogAge;
    }
}
