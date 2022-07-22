package main.java.lv.javaguru.teacher.lesson_7_encapsulation.lessoncode;

import java.util.Objects;

class BasicCounter {

    private int count;

    BasicCounter() {
    }

    public void increment() {
        count = count + 1; //count += 1;
    }

    public void decrement() {
        count = count - 1; //count += 1;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BasicCounter that = (BasicCounter) o;
        return count == that.count;
    }
}
