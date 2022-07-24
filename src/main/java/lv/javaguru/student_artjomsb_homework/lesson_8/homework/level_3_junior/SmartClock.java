package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_3_junior;

class SmartClock extends Clock {
    private int battery;

    public SmartClock(String time, int battery) {
        super(time);
        this.battery = battery;
    }

    public int getBattery() {
        return battery;
    }

    @Override
    void startClock() {
        System.out.println("Clock starts running, loading...");
    }

    @Override
    void changeTime() {
        System.out.println("Add 1 minute");
    }

    @Override
    void setTime(String time) {
        this.time = time;
    }

}
