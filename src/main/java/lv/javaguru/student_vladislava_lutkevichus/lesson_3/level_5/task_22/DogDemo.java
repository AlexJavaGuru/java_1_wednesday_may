package lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_22;

class DogDemo {

    public static void main(String[] args) {
        Dog myDog = new Dog("Zhuchka", 5, "white");

        myDog.voice();
        myDog.changeColor("black");

        myDog.voice();
    }
}
