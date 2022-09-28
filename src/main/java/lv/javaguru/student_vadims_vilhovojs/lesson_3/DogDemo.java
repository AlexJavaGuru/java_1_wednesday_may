package lv.javaguru.student_vadims_vilhovojs.lesson_3;

class DogDemo {
    public static void main(String[] args) {
        Dog kesha = new Dog("Kesha", 4 , "brown");

        kesha.voice();
        kesha.happyBirthday();
        kesha.setChangeColor("black");
        kesha.voiceAgain();
    }
}
