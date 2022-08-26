package lv.javaguru.student_rodions_pismennijs.lesson_3.level_5;

class Dog {

    String name;
    int age;
    String color;

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void voice(){
        System.out.println(this.name + " " + this.name + " " + this.name);
        System.out.println("My age is " + this.age + " y.o. and I am " + this.color);
    }

    void happyBirthday(){
        age = age + 1;
        System.out.println("Happy Birthday!!!");
        System.out.println("Now im " + this.age + " y.o.");
    }

    void changeColor(String newColor){
        this.color = newColor;
    }

}
