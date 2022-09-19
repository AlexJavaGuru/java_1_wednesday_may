package lv.javaguru.student_vladislava_lutkevichus.lesson_3.level_5.task_19;

class DogDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog("Bobik", 6);

        System.out.println(myDog.getName());
        System.out.println(myDog.age);

        myDog.setAge(3);
        System.out.println(myDog.age);

        myDog.voice();
    }
}
