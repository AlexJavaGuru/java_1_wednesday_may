package main.java.lv.javaguru.student_vladislavs_katirlovs.lesson_3.level_4;

class Phone {

        String model;

            public Phone(String newModel) {
            this.model = newModel;
        }

        String getModel () {
            return this.model;
        }
    }

    class PhoneDemo {

        public static void main(String[] args) {
            Phone myPhone = new Phone("Huawei");
            String phoneModel = myPhone.getModel();
            System.out.println("Phone model = " + phoneModel);
        }
    }
