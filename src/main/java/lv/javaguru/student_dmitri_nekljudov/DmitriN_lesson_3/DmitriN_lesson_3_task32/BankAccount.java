package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task32;

class BankAccount {
    String ownerFirstName;
    int moneyAmount;

    BankAccount( String ownerFirstName , int moneyAmount ) {
        this.ownerFirstName = ownerFirstName;
        this.moneyAmount = moneyAmount;
    }

    String getOwnerLastName() {
        return this.ownerFirstName;
    }

    public int getMoneyAmount() {
        return this.moneyAmount;
    }

}


