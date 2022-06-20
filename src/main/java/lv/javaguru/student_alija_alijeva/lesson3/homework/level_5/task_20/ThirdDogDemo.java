package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_5.task_20;

class ThirdDogDemo {
    public static void main(String[] args) {
        ThirdDog Bobik = new ThirdDog("Bobik", 6);
        Bobik.voice();
        Bobik.happyBirthday();
        Bobik.setDogAge(Bobik.dogAge + 1);
        Bobik.voice();
    }
}
