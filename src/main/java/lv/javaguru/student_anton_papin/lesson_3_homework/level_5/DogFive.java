package main.java.lv.javaguru.student_anton_papin.lesson_3_homework.level_5;

 class DogFive {
     String name;
    int age;
    String colour;

     DogFive(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;

    }

    void voice() {
        System.out.println(name + " " + age+ " "+ colour);
    }

     void changeColour() {this.colour = "Black";
    }
}

