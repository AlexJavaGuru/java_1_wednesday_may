package lv.javaguru.teacher.lesson_8_inheritance.lessoncode.abstraction;

public class RemoteController {

    private TV televizor;

    public RemoteController(TV televizor) {
        this.televizor = televizor;
    }

    public void increaseVolume() {
        televizor.volumeUp();
    }

    public void decreaseVolume() {
        televizor.volumeDown();
    }
}
