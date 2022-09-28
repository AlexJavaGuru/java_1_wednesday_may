package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_4;

import java.util.Objects;

class Safe {

    public String pinCode;
    public int balance;

    Safe(String pinCode, int balance) {
        this.pinCode = pinCode;
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Safe safe = (Safe) o;
        return balance == safe.balance && Objects.equals(pinCode, safe.pinCode);
    }

    @Override
    public String toString() {
        return "Safe{" +
                "pinCode='" + pinCode + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
