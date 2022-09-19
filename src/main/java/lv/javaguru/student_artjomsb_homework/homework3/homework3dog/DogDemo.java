package lv.javaguru.student_artjomsb_homework.homework3.homework3dog;

class DogDemo {
    public static void main(String[] args) {

        Dog sharik = new Dog("Sharik", 15, "Red");

        sharik.voice();
        sharik.voiceNameAge();
        sharik.setOlder();
        sharik.voiceNameAge();
        sharik.dogStatus();
        sharik.changeColor("blue");
        sharik.dogStatus();
        sharik.changeColor("pink");
    }
}
