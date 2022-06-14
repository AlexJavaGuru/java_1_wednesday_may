package main.java.lv.javaguru.student_alija_alijeva.lesson3.homework.level_4.task_15;


    class Phone {

        String model;



           public Phone (String newModel) {
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


