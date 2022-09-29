package main.java.lv.javaguru.student_daniels_demishins.hw_lesson_8.lvl_3.task_13;

abstract class PlayStation {
    protected String color;
    protected String brand;

    public PlayStation(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    abstract void memorySize();

    abstract void gamesAmount();

}
