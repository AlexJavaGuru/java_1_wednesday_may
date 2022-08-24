package lv.javaguru.teacher.lesson_8_inheritance.lessoncode.abstraction;

public class Demo {

    public static void main(String[] args) {
        TV samsung = new SamsungTV();
        RemoteController remoteController = new RemoteController(samsung);

        remoteController.increaseVolume();
        remoteController.increaseVolume();
        remoteController.increaseVolume();
        remoteController.increaseVolume();

        System.out.println(samsung);

        TV lgtv = new LGTV();
        RemoteController remoteController2 = new RemoteController(lgtv);

    }
}
