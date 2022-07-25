package main.java.lv.javaguru.teacher.lesson_8_inheritance.lessoncode.abstraction;

public class LGTV implements TV {

    private int channel;
    private int volume;

    @Override
    public void channelForward() {
        channel++;
    }

    @Override
    public void channelBackward() {
        channel--;
    }

    @Override
    public void volumeUp() {
        volume = volume + 5;
    }

    @Override
    public void volumeDown() {
        volume = volume - 5;
    }

    @Override
    public void mute() {
        volume = -100;
    }
}
