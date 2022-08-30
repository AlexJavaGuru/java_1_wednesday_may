package lv.javaguru.student_anton_papin.lesson_3_homework.level_5;

class DogThree {
    String name;
    int age;

    DogThree(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void voice() {
        System.out.println(name + " " + age);
    }

    void happyBirthday() {
        System.out.println("Woof! Woof! I`am" + " " + (age + 1) + " " + "now!");
    }

    void setAge(int age) {
        this.age = age;
    }
}
