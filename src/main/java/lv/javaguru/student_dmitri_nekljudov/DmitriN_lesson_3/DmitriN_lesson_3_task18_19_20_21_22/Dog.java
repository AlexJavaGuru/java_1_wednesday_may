package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task18_19_20_21_22;


class Dog {

    private String dogName;
    private int age;
    public String dogColor;

    public Dog(String dogName, int age, String dogColor) {
        this.dogName = dogName;
        this.age = age;
        this.dogColor = dogColor;


    }

    public String getDogName() {
        return dogName;
    }

    public int getAge() {
        return age;
    }

    void bark() {
        System.out.println(dogName);
        System.out.println(age + "years");
        System.out.println(dogColor);

    }

    void Birthday() {

        System.out.println("Today my Birthday Wuf Wuf Wuf");
        age = age + 1;
    }

    public void changeColors(String newColor) {
        this.dogColor = newColor;
        System.out.println("New color " + dogColor);
    }
}


