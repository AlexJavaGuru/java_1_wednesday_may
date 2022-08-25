package lv.javaguru.student_vadims_vilhovojs.lesson_3.task_32;

class BankAccount {
    String owner;
    int money;

    public BankAccount(String owner , int moneyAmount) {
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
