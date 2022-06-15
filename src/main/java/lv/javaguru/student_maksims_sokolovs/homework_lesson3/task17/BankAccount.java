package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task17;

class BankAccount {

    String ownerFirstName;
    String ownerLastName;
    int moneyAmount;

    BankAccount(String getOwnerFirstName,String getOwnerLastName,int getMoneyAmount) {

        this.ownerFirstName = getOwnerFirstName;
        this.ownerLastName = getOwnerLastName;
        this.moneyAmount = getMoneyAmount;

    }

    String getOwnerFirstName() {
        return this.ownerFirstName;

    }

    String getOwnerLastName() {
        return this.ownerLastName;

    }

    public int getMoneyAmount() {
        return this.moneyAmount;

    }

}