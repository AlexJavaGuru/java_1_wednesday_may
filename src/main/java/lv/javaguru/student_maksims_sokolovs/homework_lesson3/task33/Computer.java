package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task33;

class Computer {

    String manufacturer;
    String model;

    Computer(String manufacturer, String model) {

        this.manufacturer = manufacturer;
        this.model = model;

    }

    String getModel() {
        return model;

    }

    String getManufacturer() {
        return manufacturer;

    }

    public String toString() {
        return ("Computer manufacturer" + this.manufacturer + "model" + this.model);

    }

}