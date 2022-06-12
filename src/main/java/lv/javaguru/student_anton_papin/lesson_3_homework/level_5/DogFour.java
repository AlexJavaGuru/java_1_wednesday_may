package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_5;

 class DogFour {
    public String name;
    int age;
    String colour;

     DogFour(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;

    }

    void voice() {
        System.out.println(name + " " + age+ " "+ colour);
    }

}
