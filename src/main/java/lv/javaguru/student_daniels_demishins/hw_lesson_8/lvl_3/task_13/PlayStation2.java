package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_3.task_13;

public class PlayStation2 extends PlayStation {
    private int controllers;

    public PlayStation2(String color, String brand, int controllers) {
        super(color, brand);
        this.controllers = controllers;
    }

    public int setControllers() {
        return controllers + 2;
    }

    @Override
    void memorySize() {
        System.out.println("Memory size is 32 MB");

    }

    @Override
    void gamesAmount() {
        System.out.println("Games amount = 1000");
    }
}
