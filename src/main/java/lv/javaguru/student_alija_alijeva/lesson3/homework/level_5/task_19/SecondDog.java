package lv.javaguru.student_alija_alijeva.lesson3.homework.level_5.task_19;

class SecondDog {
    String dogsName;
    int age;

    public SecondDog(String dogsName, int age) {
        this.dogsName = dogsName;
        this.age = age;
    }

    void dogVoice() {
        System.out.println(dogsName + " " + age);
    }
}
