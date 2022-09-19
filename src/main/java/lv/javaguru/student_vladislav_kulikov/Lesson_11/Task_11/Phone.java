package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_11;

class Phone {

    protected String model;

    protected Phone(String model) {
        this.model = model;
    }

    protected void seeModelOfPhone() {
        System.out.println("Model: " + model);
    }
}
