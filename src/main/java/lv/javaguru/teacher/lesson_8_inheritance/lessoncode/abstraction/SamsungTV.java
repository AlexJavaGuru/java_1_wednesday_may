package main.java.lv.javaguru.teacher.lesson_8_inheritance.lessoncode.abstraction;

public class SamsungTV implements TV {

    private int channel;
    private int volume;

    public void channelForward() {
        channel++;
    }

    public void channelBackward() {
        channel--;
    }

    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }

    public void mute() {
        volume = 0;
    }

    @Override
    public String toString() {
        return "TV{" +
                "channel=" + channel +
                ", volume=" + volume +
                '}';
    }
}
