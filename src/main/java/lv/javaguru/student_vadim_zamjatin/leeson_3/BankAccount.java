package main.java.lv.javaguru.student_vadim_zamjatin.leeson_3;

public class BankAccount {

        String ownerFirstName;
        String ownerLastName;
        int moneyAmount;

        BankAccount(String ownerFirstName, String ownerLastName, int moneyAmount) {
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.moneyAmount = moneyAmount;
        }

        String getOwnerFirstName () {
            return this.ownerFirstName;
        }

        String getOwnerLastName () {
            return this.ownerLastName;
        }

        int getMoneyAmount() {
            return this.moneyAmount;
        }
    }
