package main.java.lv.javaguru.student_artjomsb_homework.homework3.homework3_junior;

class Phone {

    String model;
        Phone (String newModel) {
            this.model = newModel;
        }

        String getModel() {
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

