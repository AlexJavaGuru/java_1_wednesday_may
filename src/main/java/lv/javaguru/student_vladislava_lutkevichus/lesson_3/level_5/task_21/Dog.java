package lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_21;

class Dog {
    String name;
    int age;
    String color;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void voice() {
        System.out.println(name + " " + age + " " + color);
    }
}
