package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_3;

 class DogDemo {
    public static void main(String[] args) {
        Dog sharik = new Dog("Sharik",1, "Black");
        sharik.voice();
        sharik.happyBirthday();
        sharik.changeColor("White");
        sharik.voice();
    }
}
