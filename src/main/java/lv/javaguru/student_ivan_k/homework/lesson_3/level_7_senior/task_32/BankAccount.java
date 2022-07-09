package main.java.lv.javaguru.student_ivan_k.homework.lesson_3.level_7_senior.task_32;

public class BankAccount {

    String owner;
    int money;

    BankAccount(String owner, int money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    public int getMoney() {
        return this.money;
    }
}
