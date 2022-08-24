package lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_22;

class Dog {
    String name;
    String color;
    int age;

    public Dog(String name, int age, String color ) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice() {
        System.out.println(name + " " + color);
    }

    void changeColor(String newColor) {
        color = newColor;
    }
}
