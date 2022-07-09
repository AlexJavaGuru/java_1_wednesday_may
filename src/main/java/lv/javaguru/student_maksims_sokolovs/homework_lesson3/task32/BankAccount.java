package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task32;

class BankAccount {

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