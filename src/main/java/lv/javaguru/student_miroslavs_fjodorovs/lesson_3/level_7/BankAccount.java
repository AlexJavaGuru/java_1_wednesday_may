package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_3.level_7;

class BankAccount {

    String ownerFirstName;
    int moneyAmount;

    BankAccount(String ownerFirstName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.moneyAmount = moneyAmount;
    }

    String getOwner() {
        return this.ownerFirstName;
    }

    int getMoney() {
        return this.moneyAmount;
    }
}
