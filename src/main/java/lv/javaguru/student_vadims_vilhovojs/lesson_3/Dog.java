package main.java.lv.javaguru.student_vadims_vilhovojs.lesson_3;

class Dog {
    private String name;
    String color;
    int age;

    public Dog(String name , int age , String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
    void voice() {
        System.out.println(name);
        System.out.println(name);
        System.out.println(name);
        System.out.println("Kesha is " + age + " years old");
        System.out.println("Kesha`s color is " + color);
    }
    void happyBirthday() {
        System.out.println("Kesha , Happy birthday !");
        System.out.println("Now Kesha is " + (age + 1 ) + " years old");
    }
    void setChangeColor(String newColor) {
        this.color = newColor;
        System.out.println("Kesha voice!");
        System.out.println("Gav !");
        System.out.println("Now Kesha`s color is " + newColor);
    }
    void voiceAgain() {
        System.out.println("Kesha voice!");
        System.out.println("Gav !");
        System.out.println("Kesha`s color is " + color);
    }




}
