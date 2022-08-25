package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_13;

class Bmw extends Car {

    Bmw(String model, int releaseYear, int topSpeed, int currentSpeed) {
        super(model, releaseYear, topSpeed, currentSpeed);
    }

    void increaseSpeed() {
        currentSpeed++;
    }

    void onAndOffInteriorLighting(boolean isInteriorLightingOn) {
        if (isInteriorLightingOn) {
            System.out.println("The lighting was On with white color");
        } else {
            System.out.println("Lighting is off");
        }
    }

    void slowDown() {
        currentSpeed--;
    }

    void isCarHaveTuning(boolean isTheCarTuned) {
        if (isTheCarTuned) {
            System.out.println("Yes, the car has 'Alpina' tuning");
        } else {
            System.out.println("No, only M-Power wheels");
        }
    }

    @Override
    public String toString() {
        return "Mercedes{" +
                "model='" + model + '\'' +
                ", releaseYear=" + releaseYear +
                ", topSpeed=" + topSpeed +
                ", currentSpeed=" + currentSpeed +
                ", isTheCarTuned=" + isTheCarTuned +
                '}';
    }
}
