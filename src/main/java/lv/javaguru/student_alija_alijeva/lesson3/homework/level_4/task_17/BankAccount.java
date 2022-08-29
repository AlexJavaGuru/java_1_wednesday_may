package lv.javaguru.student_alija_alijeva.lesson3.homework.level_4.task_17;

class BankAccount {
    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.moneyAmount = moneyAmount;
    }

    public String getOwnerFirstName() {

        return this.ownerFirstName;
    }

    public String getOwnerLastName() {

        return this.ownerLastName;
    }

    public int getMoneyAmount() {

        return this.moneyAmount;
    }

}
