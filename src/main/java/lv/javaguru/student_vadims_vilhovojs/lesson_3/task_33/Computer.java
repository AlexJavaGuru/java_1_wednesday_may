package lv.javaguru.student_vadims_vilhovojs.lesson_3.task_33;

class Computer {
    String manufacturer;
    String model;

    public Computer(String dell , String model) {
        this.manufacturer = dell;
        this.model = model;
    }
    String getManufacturer() {
        return this.manufacturer;
    }
    String getModel() {
        return this.model;
    }
}
