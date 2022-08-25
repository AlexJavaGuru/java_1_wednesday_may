package lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task33;

class ComputerDemo {



        public static void main(String[] args) {

            Computer dell = new Computer("Dell", "XXX-1");
            String manufacturer = dell.getManufacturer();
            String model = dell.getModel();
            System.out.println("Computer manufacturer = " + manufacturer);
            System.out.println("Computer model = " + model);
        }

}
