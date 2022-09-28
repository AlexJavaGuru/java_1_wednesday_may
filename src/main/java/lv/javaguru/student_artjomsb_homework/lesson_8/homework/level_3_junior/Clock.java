package lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_3_junior;

abstract class Clock {
    protected String time;

    public Clock(String time) {
        this.time = time;
    }

    abstract void startClock();

    abstract void changeTime();

    public String getTime() {
        return time;
    }

    abstract void setTime(String time);

}
