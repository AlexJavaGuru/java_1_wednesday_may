package lv.javaguru.teacher.lesson_4_if_statement.lessoncode;

public class Car {

    private String brand;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
    private boolean engineOn;

    public Car(String brand, String color, int maxSpeed) {
        this.brand = brand;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
        this.engineOn = false;
    }

    public void speedUp() {
        if (engineOn && currentSpeed < maxSpeed) {
            currentSpeed++; // currentSpeed = currentSpeed + 1;
        } else {
            System.out.println("Engine is off!");
        }
    }

    public void speedDown() {
        currentSpeed--;
    }

    public void turnEngineOn() {
        if (engineOn) {
            System.out.println("Engine is already started");
        } else {
            engineOn = true;
        }
    }

    public void turnEngineOff() {
        if (currentSpeed == 0) {
            engineOn = false;
        } else {
            System.out.println("Current speed is not 0");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isEngineOn() {
        return engineOn;
    }
}
