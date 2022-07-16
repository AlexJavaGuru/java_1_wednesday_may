package main.java.lv.javaguru.teacher.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

public class Car {

    private String brand;
    private int horsePower;
    private int currentSpeed;
    private Transmission transmission;

    public Car(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return horsePower == car.horsePower &&
                currentSpeed == car.currentSpeed &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(transmission, car.transmission);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                ", currentSpeed=" + currentSpeed +
                ", transmission=" + transmission +
                '}';
    }
}
