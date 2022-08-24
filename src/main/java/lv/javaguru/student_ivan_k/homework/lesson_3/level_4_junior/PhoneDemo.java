package lv.javaguru.student_ivan_k.homework.lesson_3.level_4_junior;

import lv.javaguru.student_ivan_k.homework.lesson_3.level_4_junior.Phone;

class PhoneDemo {

    public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }

    }
