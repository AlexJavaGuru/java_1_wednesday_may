package main.java.lv.javaguru.student_vladislav_kulikov.Lesson_11.Task_5;

class Safe {

    private int password;
    private int balance;

    Safe(int password, int balance) {
        this.password = password;
        this.balance = balance;
    }


    void getMoney(int password, int balance) {
        if (password == this.password) {
            this.balance -= balance;
        }
    }

    void putMoney(int password, int balance) {
        if (password == this.password) {
            this.balance += balance;
        }
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Safe{" +
                "password=" + password +
                ", balance=" + balance +
                '}';
    }
}