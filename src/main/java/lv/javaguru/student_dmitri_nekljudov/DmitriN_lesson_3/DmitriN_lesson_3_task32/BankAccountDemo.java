package lv.javaguru.student_dmitri_nekljudov.DmitriN_lesson_3.DmitriN_lesson_3_task32;

class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount BankAccount = new BankAccount(" Viktor ", 100000);
        String ownerFirstName = BankAccount.getOwnerLastName();
        int moneyAmount = BankAccount.getMoneyAmount();
        System.out.println("Owner first name = " + ownerFirstName);
        System.out.println("Money amount = " + moneyAmount);
    }

}
