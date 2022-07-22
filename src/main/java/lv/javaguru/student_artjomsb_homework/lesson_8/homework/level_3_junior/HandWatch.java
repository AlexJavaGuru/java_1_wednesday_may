package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_3_junior;

class HandWatch extends Clock {
    private String watchMaterial;

    public HandWatch(String watchMaterial, String time) {
        super(time);
        this.watchMaterial = watchMaterial;

    }

    @Override
    void startClock() {
        System.out.println("Start the clock mechanism");
    }

    @Override
    void changeTime() {
        System.out.println("Turning the minute arrow to the next division");
    }

    @Override
    void setTime(String time) {
        System.out.println("Turning the minute arrow to the" + time);
    }
}
