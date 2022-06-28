package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_33;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", "XXX-1");
        String manufacturer = dell.getManufacturer();
        String model = dell.getModel();
        System.out.println("Computer manufacturer = " + manufacturer);
        System.out.println("Computer model = " + model);
        //or
        System.out.println(dell);
    }
}
