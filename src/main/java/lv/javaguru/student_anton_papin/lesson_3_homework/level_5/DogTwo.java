package lv.javaguru.student_anton_papin.lesson_3_homework.level_5;

class DogTwo {
    String name;
    int age;

    DogTwo(String name, int age) {
        this.name = name;
        this.age = age;

    }

    void voice() {
        System.out.println(name + " " + age);
    }
}
