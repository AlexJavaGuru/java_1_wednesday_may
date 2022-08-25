package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_13;

class Subaru extends Car{

    Subaru (String model, int releaseYear, int topSpeed, int currentSpeed) {
        super(model ,releaseYear, topSpeed, currentSpeed);
    }

    @Override
    void increaseSpeed() {
        currentSpeed+=5;
    }

   @Override
    void slowDown() {
        currentSpeed-=5;
    }
    @Override
    void isCarHaveTuning(boolean isTheCarTuned) {
        if(isTheCarTuned) {
            System.out.println("Yes, this car is just made for racing, it has so many improvements");
        } else {
            System.out.println("No, only BBS wheels and loud exhaust");
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
