package lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_29;

class Car {

    String brand;
    String color;
    int yarOfBild;
    boolean engineOn;
    boolean needToRefuel;

    public Car(String newBrand, String newColor, int newYarOfBild, Boolean newNeedToRefuel) {
        this.brand = newBrand;
        this.color = newColor;
        this.yarOfBild = newYarOfBild;
        this.needToRefuel = newNeedToRefuel;

    }

    public String getBrand() {
        return brand;
    }


    public void startedEngine() {
        this.engineOn = true;
    }

    public boolean isEngineOn() {
        return engineOn;
    }
}
