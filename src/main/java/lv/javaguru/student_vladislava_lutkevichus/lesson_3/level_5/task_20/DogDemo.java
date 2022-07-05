package main.java.lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_20;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik", 2);

        System.out.println(myDog.age);

        myDog.voice();
        myDog.happyBirthday();

        myDog.voice();
        myDog.happyBirthday();

        myDog.voice();
    }
}
