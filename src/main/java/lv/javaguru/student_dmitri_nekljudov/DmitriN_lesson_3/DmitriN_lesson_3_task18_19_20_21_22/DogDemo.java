package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task18_19_20_21_22;

class DogDemo {

    public static void main(String args[]) {


        Dog sharik = new Dog();

        sharik.bark();
        sharik.sayYourName();
        sharik.sayYourName();
        sharik.sayYourName();

        sharik.name = "Sharik";
        sharik.age = 2;


        System.out.println(" Age: " + sharik.age);

        sharik.happyBirthday();
        sharik.setColor();
        sharik.changeeColor(Dog.BLACK);
        sharik.voice();
        sharik.changeColor(Dog.YELLOW);

    }
}
