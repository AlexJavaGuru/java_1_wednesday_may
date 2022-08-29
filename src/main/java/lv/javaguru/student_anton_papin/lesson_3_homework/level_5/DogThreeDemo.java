package lv.javaguru.student_anton_papin.lesson_3_homework.level_5;

class DogThreeDemo {
    public static void main(String[] args) {
        DogThree Walter = new DogThree("Walter", 12);
        Walter.voice();
        Walter.happyBirthday();
        Walter.setAge(Walter.age + 1);
        Walter.voice();
    }
}
