package main.java.lv.javaguru.student_maksims_sokolovs.homework_lesson3.task32;

class BankAccount2Demo {

    public static void main(String[] args) {

        BankAccount2 bankAccount = new BankAccount2("Viktor",100000);
        String ownerFirstName = bankAccount.getOwner();
        double moneyAmount = bankAccount.getMoney();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);

    }

}