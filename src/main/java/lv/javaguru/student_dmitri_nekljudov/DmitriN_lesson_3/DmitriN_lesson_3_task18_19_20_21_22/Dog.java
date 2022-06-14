package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task18_19_20_21_22;


class Dog {
    static final String RED = "\u001B[31m";
    static final String YELLOW = "\u001B[33m";
    static final String BLACK = "\u001B[30m";


    String name;
    int age;


    public Dog() {


    }


    public static void print(String color) {
        System.out.print(color + "\u0580");
    }

    void bark() {
        System.out.println(" Wuf ");


    }

    void changeeColor(String newColor) {
        print(BLACK);
        System.out.println(" Sharik ");
    }

    void sayYourName() {
        System.out.println(" Sharik ");
    }

    void happyBirthday() {
        System.out.println(" Sharik say : Today my Birthday Wyf Wyf Wyf " + " Age : " + (age + 1));
    }


    void setColor() {
        System.out.println(" Color Sharik : Red ");

    }


    void voice() {
        print(RED);
        System.out.println(" Wuf ");


    }

    void changeColor(String newColor) {
        print(YELLOW);
        System.out.println(" Sharik ");
    }
}


