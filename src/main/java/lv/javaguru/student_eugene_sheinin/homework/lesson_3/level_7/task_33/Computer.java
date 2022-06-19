package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_33;

public class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Computer manufacturer " + this.manufacturer + ", model " + this.model;
    }
}
