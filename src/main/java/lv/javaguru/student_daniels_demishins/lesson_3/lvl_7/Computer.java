package lv.javaguru.student_daniels_demishins.lesson_3.lvl_7;

public class Computer {
    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }
    String getManufacturer(){
        return this.manufacturer;
    }
    String getModel(){
        return this.model;
    }
}
