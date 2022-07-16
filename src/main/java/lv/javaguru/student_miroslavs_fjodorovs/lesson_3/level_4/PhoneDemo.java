package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_4;

import main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_4.Phone;

class PhoneDemo {

    public static void main(String[] args) {
        Phone myPhone = new Phone("Huawei");
        String phoneModel = myPhone.getModel();
        System.out.println("Phone model = " + phoneModel);
    }
}
