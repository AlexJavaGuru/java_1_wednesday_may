package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task20;

class DogDemo {

    public static void main(String[] args) {

        Dog reks = new Dog(2);

        reks.voice();
        reks.happyBirthday();
        reks.setAge(reks.age + 1);

    }

}