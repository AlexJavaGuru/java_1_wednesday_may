package lv.javaguru.student_artjomsb_homework.lesson_13_junit.lessoncode.multilayer;

import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.DataBaseImpl;
import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.ServiceImpl;
import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.UI;

public class Demo {

    public static void main(String[] args) {
        DataBaseImpl databaseImpl = new DataBaseImpl();
        ServiceImpl service = new ServiceImpl(databaseImpl);
        lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.UI myUI = new UI(service);

        myUI.askUser(123);

        String result = myUI.giveUserInfo(10);
        System.out.println(result);
    }
}
