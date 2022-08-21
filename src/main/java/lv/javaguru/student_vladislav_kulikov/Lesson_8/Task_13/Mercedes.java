package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_13;

class Mercedes extends Car {

    Mercedes(String model, int releaseYear, int topSpeed, int currentSpeed) {
        super(model ,releaseYear, topSpeed, currentSpeed);
    }

    @Override
    void increaseSpeed() {
        currentSpeed++;
    }

    @Override
    void slowDown() {
        currentSpeed--;
    }


    void onMusic() {
        System.out.println("Music is included from the phone");
    }

    void offMusic() {
        System.out.println("Music was turned off");
    }

    @Override
    void isCarHaveTuning(boolean isTheCarTuned) {
        if(isTheCarTuned) {
            System.out.println("Yes, the car has 'Brabus' tuning");
        } else {
            System.out.println("No, the car is stock");
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
