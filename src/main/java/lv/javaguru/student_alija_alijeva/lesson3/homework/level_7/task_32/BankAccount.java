package lv.javaguru.student_alija_alijeva.lesson3.homework.level_7.task_32;

public class BankAccount {
    String owner;
    int money;

    public BankAccount(String owner, int moneyAmount) {
        this.owner = owner;
        this.money = moneyAmount;
    }

    String getOwner() {
        return this.owner;
    }

    int getMoney() {
        return this.money;
    }

}


