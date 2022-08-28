package main.java.lv.javaguru.student_andrei_de.Homework.lesson7;


class BasicCounter {

    private int count;

    BasicCounter() {
    }

    public void increment() {
        count = count + 1;
    }

    public void decrement() {
        count = count - 1;
    }

    public void clear() {
        count = 0;
    }

    public int getCount() {
        return count;
    }

    public void setCounterValue(int value) {
        if (value > 0) {
            count = value;
        } else {
            count = 0;
        }
    }
}

