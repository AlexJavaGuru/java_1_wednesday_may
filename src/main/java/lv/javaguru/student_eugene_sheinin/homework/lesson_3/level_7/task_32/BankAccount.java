package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_3.level_7.task_32;

public class BankAccount {
    String owner;
    double money;

    BankAccount(String owner, double money) {
        this.owner = owner;
        this.money = money;
    }

    String getOwner() {
        return this.owner;
    }

    double getMoney() {
        return this.money;
    }
}
