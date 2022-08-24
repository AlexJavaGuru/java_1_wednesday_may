package lv.javaguru.student_maksims_sokolovs.homework_lesson3.task32;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Viktor",100000);
        String ownerFirstName = bankAccount.getOwner();
        double moneyAmount = bankAccount.getMoney();

        System.out.println("Owner = " + ownerFirstName);
        System.out.println("Money = " + moneyAmount);

    }

}