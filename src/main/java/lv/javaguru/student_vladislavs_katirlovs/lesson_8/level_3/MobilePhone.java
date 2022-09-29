package lv.javaguru.student_vladislavs_katirlovs.lesson_8.level_3;

class MobilePhone extends Phone {

    private boolean hasColorScreen;

    @Override
    void call() {
        System.out.println("Calling...");
    }

    @Override
    void sendMessage() {
        System.out.println("Sending...");
    }
}
