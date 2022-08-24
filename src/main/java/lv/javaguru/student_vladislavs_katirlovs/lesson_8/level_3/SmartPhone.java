package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_3;

class SmartPhone extends Phone{

    private String operatingSystem;

    @Override
    void call() {
        System.out.println("Calling...");
    }

    @Override
    void sendMessage() {
        System.out.println("Sending...");
    }

}
