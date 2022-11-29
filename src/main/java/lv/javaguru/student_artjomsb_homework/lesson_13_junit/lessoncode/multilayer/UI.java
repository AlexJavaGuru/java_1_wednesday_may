package lv.javaguru.student_artjomsb_homework.lesson_13_junit.lessoncode.multilayer;

import lv.javaguru.teacher.lesson_13_junit.lessoncode.multilayer.Service;

public class UI {

    private Service service;

    public UI(Service service) {
        this.service = service;
    }

    public void askUser(Integer input) {
        service.putIntoDB(input);
    }

    public String giveUserInfo(Integer userInt) {
        return service.readFromDB(userInt);
    }
}
