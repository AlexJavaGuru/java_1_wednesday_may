package main.java.lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task17;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount BankAccount = new BankAccount("Viktor", "Savonin",  100000 );

        String ownerFirstName = BankAccount.getOwnerFirstName();
        String ownerLastName = BankAccount.getOwnerLastName();
        int moneyAmount = BankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Owner last name = " + ownerLastName);
        System.out.println("Money amount = " + moneyAmount);
    }
}
