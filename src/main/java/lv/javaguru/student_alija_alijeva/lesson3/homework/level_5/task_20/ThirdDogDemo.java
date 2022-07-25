package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_5.task_20;

class ThirdDogDemo {
    public static void main(String[] args) {
        ThirdDog bobik = new ThirdDog("Bobik", 6);
        bobik.voice();
        bobik.happyBirthday();
        bobik.setDogAge(bobik.dogAge + 1);
        bobik.voice();
    }
}
